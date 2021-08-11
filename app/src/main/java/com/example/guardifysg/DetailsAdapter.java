package com.example.guardifysg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.ViewHolder> {

    List<PolicyDetail> policyDetailsList;

    public DetailsAdapter(List<PolicyDetail> policyDetailsList) {
        this.policyDetailsList = policyDetailsList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.policy_details_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    // called once for every individual row
    public void onBindViewHolder(@NonNull @NotNull DetailsAdapter.ViewHolder holder, int position) {
        PolicyDetail policyDetails = policyDetailsList.get(position);
        holder.detailTitle.setText(policyDetails.getDetailTitle());
        holder.detailText.setText(policyDetails.getDetailText());

        // holds current state of movie
        boolean isExpanded = policyDetailsList.get(position).isExpanded();
        // makes view visible or gone based on state of isExpanded
        holder.expandableDetail.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return policyDetailsList.size();
    }

    // responsible for managing rows & holds elements in each individual row
    class ViewHolder extends RecyclerView.ViewHolder {
        TextView detailTitle, detailText;
        ConstraintLayout expandableDetail;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            detailTitle = itemView.findViewById(R.id.detailTitle);
            detailText = itemView.findViewById(R.id.detailText);
            expandableDetail = itemView.findViewById(R.id.expandableDetail);

            detailTitle.setOnClickListener(view -> {
                PolicyDetail policyDetails = policyDetailsList.get(getAbsoluteAdapterPosition());
                policyDetails.setExpanded(!policyDetails.isExpanded());
                notifyItemChanged(getAbsoluteAdapterPosition());
            });
        }
    }
}
