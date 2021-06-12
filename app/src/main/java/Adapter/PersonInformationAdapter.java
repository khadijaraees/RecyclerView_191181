package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.khadija.recyclerview_191181.R;

import java.util.List;

import Model.PersonInformation;

public class PersonInformationAdapter extends RecyclerView.Adapter<PersonInformationAdapter.ViewHolder> {
    List<PersonInformation> personinformationlist;
    Context context;

    public PersonInformationAdapter(List<PersonInformation> personinformationlist, Context context) {
        this.personinformationlist = personinformationlist;
        this.context = context;
    }

    @NonNull
    @Override
    public PersonInformationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonInformationAdapter.ViewHolder holder, int position) {
     PersonInformation person=personinformationlist.get(position);
     holder.txtname.setText(person.getName());
        holder.txtage.setText(person.getAge());
        holder.txtgender.setText(person.getGender());
        holder.txtphonenum.setText(person.getPhoneNum());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                personinformationlist.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(holder.getAdapterPosition(),personinformationlist.size());
            }
        });
    }

    @Override
    public int getItemCount() {
        return personinformationlist.size();
    }
    public  class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView txtname,txtage,txtgender,txtphonenum;
        Button button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname=itemView.findViewById(R.id.name);
            txtage=itemView.findViewById(R.id.age);
            button=itemView.findViewById(R.id.btn1);
            txtgender=itemView.findViewById(R.id.gender);
            txtphonenum=itemView.findViewById(R.id.phonenum);
        }

        public void onClick(View v) {
        }
    }
}
