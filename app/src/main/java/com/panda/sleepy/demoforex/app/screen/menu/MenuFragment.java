package com.panda.sleepy.demoforex.app.screen.menu;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.panda.sleepy.demoforex.R;
import com.panda.sleepy.demoforex.databinding.FragmentMenuBinding;
import com.panda.sleepy.demoforex.di.viewmodel.Injectable;
import com.panda.sleepy.demoforex.util.BaseFragment;
import com.panda.sleepy.demoforex.viewmodel.TransitionViewModel;

import javax.inject.Inject;

/*
 * Created by Anton Popov on 20.08.18.
 */
public class MenuFragment extends BaseFragment<FragmentMenuBinding> implements Injectable {

    @Inject
    protected TransitionViewModel viewModel;

    @Override
    protected int getLayout() {
        return R.layout.fragment_menu;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setHandler(viewModel);
    }

}
