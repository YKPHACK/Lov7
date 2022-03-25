package com.example.lackofvision;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProblemsUserViewHolder extends RecyclerView.ViewHolder
{
    ImageView img1;
    TextView t1, t2, t3;
    EditText et1;

    public ProblemsUserViewHolder(@NonNull View itemView)
    {
        super(itemView);
        img1 = (ImageView) itemView.findViewById(R.id.company_logo_problem);
        t1 = (TextView) itemView.findViewById(R.id.company_name_problem);
        t2 = (TextView) itemView.findViewById(R.id.company_subject_problem_txt);
        t3 = (TextView) itemView.findViewById(R.id.company_description_problem_txt);
        et1 = (EditText) itemView.findViewById(R.id.solution_problem_textbox);
    }
}
