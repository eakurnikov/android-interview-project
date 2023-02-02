package biz.filmeroo.premier.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H!\u00a2\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H!\u00a2\u0006\u0002\b\bJ\b\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lbiz/filmeroo/premier/app/Binder;", "", "()V", "detailActivity", "Lbiz/filmeroo/premier/detail/DetailActivity;", "detailActivity$app_debug", "mainActivity", "Lbiz/filmeroo/premier/main/MainActivity;", "mainActivity$app_debug", "searchActivity", "Lbiz/filmeroo/premier/main/SearchActivity;", "app_debug"})
@dagger.Module()
public abstract class Binder {
    
    public Binder() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract biz.filmeroo.premier.main.MainActivity mainActivity$app_debug();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract biz.filmeroo.premier.detail.DetailActivity detailActivity$app_debug();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract biz.filmeroo.premier.main.SearchActivity searchActivity();
}