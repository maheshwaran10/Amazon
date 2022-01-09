package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.amazon.app.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class ChipChipGroup extends AppCompatActivity {
    private EditText editTextKeyword;
    private ChipGroup chipGroup;
    private Button buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip_chip_group);

        this.editTextKeyword = (EditText) this.findViewById(R.id.editText_keyword);
        this.chipGroup = (ChipGroup) this.findViewById(R.id.chipGroup);
        this.buttonAdd = (Button) this.findViewById(R.id.button_add);

        this.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNewChip();
            }
        });

    }

    private void addNewChip() {
        String keyword = this.editTextKeyword.getText().toString();
        if (keyword == null || keyword.isEmpty()) {
            Toast.makeText(this, "Please enter the keyword!", Toast.LENGTH_LONG).show();
            return;
        }
        try {
            LayoutInflater inflater = LayoutInflater.from(this);

            // Create a Chip from Layout.
            Chip newChip = (Chip) inflater.inflate(R.layout.layout_chip_entry, this.chipGroup, false);
            newChip.setText(keyword);

            //
            // Other methods:
            //
            // newChip.setCloseIconVisible(true);
            // newChip.setCloseIconResource(R.drawable.your_icon);
            // newChip.setChipIconResource(R.drawable.your_icon);
            // newChip.setChipBackgroundColorResource(R.color.red);
            // newChip.setTextAppearanceResource(R.style.ChipTextStyle);
            // newChip.setElevation(15);

            this.chipGroup.addView(newChip);

            // Set Listener for the Chip:
            newChip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    handleChipCheckChanged((Chip) buttonView, isChecked);
                }
            });

            newChip.setOnCloseIconClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    handleChipCloseIconClicked((Chip) v);
                }
            });


            this.editTextKeyword.setText("");

        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Error: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    private void handleChipCloseIconClicked(Chip v) {
        ChipGroup parent = (ChipGroup) v.getParent();
        parent.removeView(v);
    }


    private void handleChipCheckChanged(Chip buttonView, boolean isChecked) {
    }
}
