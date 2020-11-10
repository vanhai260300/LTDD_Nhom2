package com.nvh.login_logup.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.nvh.login_logup.R;

import java.util.ArrayList;
import java.util.List;

public class Nearby_Fragment extends Fragment {


    public Nearby_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recent, container, false);
        List<Product> image_details = getListData();
        GridView gridView = (GridView) view.findViewById(R.id.gridView);
        gridView.setAdapter(new CustomGridAdapter(getActivity(), image_details));



        return view;
    }
    private List<Product> getListData() {
        List<Product> list = new ArrayList<Product>();
        Product product1 = new Product("Sữa tươi TC đường đen", R.drawable.sp1,"2 Thanh Sơn", 98000000);
        Product product2 = new Product("Sữa tươi TC đường đen", R.drawable.sp2,"2 Thanh Sơn", 98000000);
        Product product3 = new Product("Sữa tươi TC đường đen", R.drawable.sp3,"2 Thanh Sơn", 98000000);
        Product product4 = new Product("Sữa tươi TC đường đen", R.drawable.sp4,"2 Thanh Sơn", 98000000);
        Product product5 = new Product("Sữa tươi TC đường đen", R.drawable.sp5,"2 Thanh Sơn", 98000000);
        Product product6 = new Product("Sữa tươi TC đường đen", R.drawable.sp1,"2 Thanh Sơn", 98000000);
        Product product7 = new Product("Sữa tươi TC đường đen", R.drawable.sp2,"2 Thanh Sơn", 98000000);
        Product product8 = new Product("Sữa tươi TC đường đen", R.drawable.sp3,"2 Thanh Sơn", 98000000);
        Product product9 = new Product("Sữa tươi TC đường đen", R.drawable.sp4,"2 Thanh Sơn", 98000000);
        Product product10 = new Product("Sữa tươi TC đường đen", R.drawable.sp5,"2 Thanh Sơn", 98000000);
        Product product11 = new Product("Sữa tươi TC đường đen", R.drawable.sp1,"2 Thanh Sơn", 98000000);
        Product product12 = new Product("Sữa tươi TC đường đen", R.drawable.sp3,"2 Thanh Sơn", 98000000);
        Product product13 = new Product("Sữa tươi TC đường đen", R.drawable.sp2,"2 Thanh Sơn", 98000000);
        Product product14 = new Product("Sữa tươi TC đường đen", R.drawable.sp4,"2 Thanh Sơn", 98000000);
        Product product15 = new Product("Sữa tươi TC đường đen", R.drawable.sp1,"2 Thanh Sơn", 98000000);
        Product product16 = new Product("Sữa tươi TC đường đen", R.drawable.sp5,"2 Thanh Sơn", 98000000);

        //Add item vào List sản phẩm
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);
        list.add(product9);
        list.add(product10);
        list.add(product11);
        list.add(product12);
        list.add(product13);
        list.add(product14);
        list.add(product15);
        list.add(product16);

        return list;
    }
}