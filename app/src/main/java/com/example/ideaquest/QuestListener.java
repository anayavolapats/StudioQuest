package com.example.ideaquest;

import android.view.View;

public class QuestListener implements View.OnClickListener {
    int answer;
    MainActivity ma;

    public QuestListener(MainActivity m, int answer_num){
        answer = answer_num;
        ma = m;
    }

    @Override
    public void onClick(View v) {
        ma.answer(answer);
    }
}
