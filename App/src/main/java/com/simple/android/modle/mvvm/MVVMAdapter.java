package com.simple.android.modle.mvvm;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * @fileName: MVVMAdapter
 * @author: zhangzeyan
 * @date: 2017/6/12
 * @time: 下午4:22
 * @description:
 **/
public class MVVMAdapter<T> extends BaseAdapter {

    private LayoutInflater inflater;
    private int layoutId;
    private int variableId;
    private List<T> list;

    public MVVMAdapter(Context context, int layoutId, List<T> list, int variableId) {
        this.layoutId = layoutId;
        this.list = list;
        this.variableId = variableId;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewDataBinding dataBinding;
        if (convertView == null) {
            dataBinding = DataBindingUtil.inflate(inflater, layoutId, parent, false);
        }else{
            dataBinding = DataBindingUtil.getBinding(convertView);
        }
        dataBinding.setVariable(variableId, list.get(position));
        return dataBinding.getRoot();
    }
}
