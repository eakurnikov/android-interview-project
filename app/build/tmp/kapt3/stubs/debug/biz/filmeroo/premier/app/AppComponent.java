package biz.filmeroo.premier.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lbiz/filmeroo/premier/app/AppComponent;", "Ldagger/android/AndroidInjector;", "Lbiz/filmeroo/premier/app/PremierApp;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, biz.filmeroo.premier.app.AppModule.class, biz.filmeroo.premier.app.Binder.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<biz.filmeroo.premier.app.PremierApp> {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lbiz/filmeroo/premier/app/AppComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lbiz/filmeroo/premier/app/PremierApp;", "()V", "app_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<biz.filmeroo.premier.app.PremierApp> {
        
        public Builder() {
            super();
        }
    }
}