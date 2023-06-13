package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class test4 extends AppCompatActivity implements View.OnClickListener {

    TextView totalQuestionsTextView;
    TextView questionsTextView;


    Button ans1, ans2, ans3, next;

    int score = 0;
    int totalQuestions = QuestionAnswer4.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test4);
        totalQuestionsTextView = findViewById(R.id.total_questions);
        questionsTextView = findViewById(R.id.questions);
        ans1 = findViewById(R.id.ans1);
        ans2 = findViewById(R.id.ans2);
        ans3 = findViewById(R.id.ans3);
        next = findViewById(R.id.next);

        ans1.setOnClickListener(this);
        ans2.setOnClickListener(this);
        ans3.setOnClickListener(this);
        next.setOnClickListener(this);

        totalQuestionsTextView.setText("Количество вопросов : " + totalQuestions);
        loadNewQuestion();
    }


    @Override
    public void onClick(View view) {
        ans1.setBackgroundColor(Color.GRAY);
        ans2.setBackgroundColor(Color.GRAY);
        ans3.setBackgroundColor(Color.GRAY);


        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.next){
            if(selectedAnswer.equals(QuestionAnswer4.correctAnswers[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();


        }else{
            //choices button clicked
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.LTGRAY);

        }

    }


    void loadNewQuestion() {

        if (currentQuestionIndex == totalQuestions) {
            finishQuiz();
            return;
        }

        questionsTextView.setText(QuestionAnswer4.question[currentQuestionIndex]);
        ans1.setText(QuestionAnswer4.choices[currentQuestionIndex][0]);
        ans2.setText(QuestionAnswer4.choices[currentQuestionIndex][1]);
        ans3.setText(QuestionAnswer4.choices[currentQuestionIndex][2]);

    }
        void finishQuiz () {
            String passStatus = "";
            if (score > totalQuestions * 0.60) {
                passStatus = "Вы прошли тест :)";
            } else {
                passStatus = "Вы провалили тест :(";
            }
        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Ваш счет "+ score+" из максимального количества вопросов: "+ totalQuestions)
                .setPositiveButton("Поробуйте еще раз!",(dialogInterface, i) -> restartQuiz() )
                .setNegativeButton("Домой!",(dialogInterface, i) -> back() )
            .setCancelable(false)
                .show();
}
    private void back() {
        Intent a = new Intent(this, menutests.class);
        startActivity(a);
        finish();
    }
    void restartQuiz(){
        score = 0;
        currentQuestionIndex =0;
        loadNewQuestion();
    }

    public void home(View view) {
        Intent a = new Intent(this, menu.class);
        startActivity(a);
        finish();
    }
    }
