package com.panda.sleepy.demoforex.di.viewmodel;

import com.panda.sleepy.demoforex.viewmodel.DealsViewModel;
import com.panda.sleepy.demoforex.viewmodel.TransitionViewModel;

import dagger.Subcomponent;

/*
 * Created by Anton Popov on 17.08.18.
 */
@Subcomponent
public interface ViewModelComponent {

    @Subcomponent.Builder
    interface Builder {
        ViewModelComponent build();
    }

    TransitionViewModel transitionViewModel();

    DealsViewModel dealsViewModel();

}
