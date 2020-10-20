package co.com.ceiba.daggerapplication.dependencyinjection;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    Context context;

    public ContextModule (Context context) {
        this.context = context;
    }

    @Provides
    public Context getContext() {
        return context;
    }
}
