package com.example.tabpro.ui.main;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tabpro.R;
import org.jetbrains.annotations.NotNull;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView txtProductName;
    TextView txtProductPrice;

    public ViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        txtProductName = itemView.findViewById(R.id.idProductName);
        txtProductPrice = itemView.findViewById(R.id.idProductPrice);
    }
}
