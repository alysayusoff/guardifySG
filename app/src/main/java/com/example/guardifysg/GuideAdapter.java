package com.example.guardifysg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class GuideAdapter extends RecyclerView.Adapter<GuideAdapter.ViewHolder> {

    List<PolicyGuide> insuranceBasicsTitles;

    public GuideAdapter(List<PolicyGuide> insuranceBasicsTitles) {
        this.insuranceBasicsTitles = insuranceBasicsTitles;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.policy_guide_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull GuideAdapter.ViewHolder holder, int position) {
        PolicyGuide policyGuide = insuranceBasicsTitles.get(position);
        holder.itemTitle.setText(policyGuide.getTitle());
        holder.itemExpanded.setText(policyGuide.getDescription());
        boolean isExpanded = insuranceBasicsTitles.get(position).isExpanded();
        holder.expandableBox.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
        holder.arrow.setRotation(isExpanded ? 90 : 0);
    }

    @Override
    public int getItemCount() {
        return insuranceBasicsTitles.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemTitle, itemExpanded;
        ConstraintLayout expandableBox;
        ImageView arrow;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            itemTitle = itemView.findViewById(R.id.itemTitle);
            itemExpanded = itemView.findViewById(R.id.itemExpanded);
            expandableBox = itemView.findViewById(R.id.expandableLayout);
            arrow = itemView.findViewById(R.id.arrow);

            itemTitle.setOnClickListener(view -> {
                PolicyGuide policyGuide = insuranceBasicsTitles.get(getAbsoluteAdapterPosition());
                policyGuide.setExpanded(!policyGuide.isExpanded());
                notifyItemChanged(getAbsoluteAdapterPosition());
            });
        }
    }
}
