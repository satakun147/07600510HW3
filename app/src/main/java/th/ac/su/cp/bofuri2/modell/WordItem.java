package th.ac.su.cp.bofuri2.modell;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import th.ac.su.cp.bofuri2.R;

public class WordItem {
    public final int imageResId;
    public final String text1;
    public final String text2;
    public WordItem(int imageResId, String text1, String text2) {
        this.imageResId = imageResId;
        this.text1 = text1;
        this.text2 = text2;
    }
}