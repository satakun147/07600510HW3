package th.ac.su.cp.bofuri2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import th.ac.su.cp.bofuri2.modell.WordItem;

public class CharacterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        LinearLayoutManager lm = new LinearLayoutManager(CharacterActivity.this);
        MyAdapter adapter = new MyAdapter();
        RecyclerView rv = findViewById(R.id.word_list);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
    }
}
class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private WordItem[] items = {
            new WordItem(R.drawable.maple, "Name : Maple", "Guild : Maple Tree"),
            new WordItem(R.drawable.sally, "Name : Sally", "Guild : Maple Tree"),
            new WordItem(R.drawable.chrome, "Name : Chrome", "Guild : Maple Tree"),
            new WordItem(R.drawable.iz, "Name : Iz", "Guild : Maple Tree"),
            new WordItem(R.drawable.yui, "Name : Yui", "Guild : Maple Tree"),
            new WordItem(R.drawable.mai, "Name : Mai", "Guild : Maple Tree"),
            new WordItem(R.drawable.kanade, "Name : Kanada", "Guild : Maple Tree"),
            new WordItem(R.drawable.kasumi, "Name : Kasumi", "Guild : Maple Tree"),
            new WordItem(R.drawable.marcus, "Name : Marcus", "Guild : Kingdom of the Flame Emperor"),
            new WordItem(R.drawable.mii, "Name : Mii", "Guild : Kingdom of the Flame Emperor"),
            new WordItem(R.drawable.shin, "Name : Shin", "Guild : Kingdom of the Flame Emperor"),
            new WordItem(R.drawable.misery, "Name : Misery", "Guild : Kingdom of the Flame Emperor"),
            new WordItem(R.drawable.drag, "Name : Drag", "Guild : Congregation of the Holy Swords"),
            new WordItem(R.drawable.dred, "Name : Dred", "Guild : Congregation of the Holy Swords"),
            new WordItem(R.drawable.frederica, "Name : Frederica", "Guild : Congregation of the Holy Swords"),
            new WordItem(R.drawable.payne, "Name : Payne", "Guild : Congregation of the Holy Swords")
    };

    public MyAdapter() {
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_word_item,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(items[position].imageResId);
        holder.textView1.setText(items[position].text1);
        holder.textView2.setText(items[position].text2);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
    static  class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView1;
        TextView textView2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }
}