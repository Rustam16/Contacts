package space.example.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    List<Person> personList;
    Context context;

    public RecyclerViewAdapter(List<Person> personList, Context context) {
        this.personList = personList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_line_person, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_person_name.setText(personList.get(position).getName());
        holder.tv_personPhoneE.setText(String.valueOf(personList.get(position).getNumber()));
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_person_name;
        TextView tv_personPhoneE;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_person_name = itemView.findViewById(R.id.tv_person_nameR);
            tv_personPhoneE = itemView.findViewById(R.id.tv_personPhoneE);
        }
    }
}
