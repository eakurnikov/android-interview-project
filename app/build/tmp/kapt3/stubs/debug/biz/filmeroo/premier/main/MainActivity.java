package biz.filmeroo.premier.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0011H\u0014J\b\u0010\u001a\u001a\u00020\u0011H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lbiz/filmeroo/premier/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lbiz/filmeroo/premier/main/FilmPresenter$View;", "()V", "adapter", "Lbiz/filmeroo/premier/main/FilmAdapter;", "getAdapter$app_debug", "()Lbiz/filmeroo/premier/main/FilmAdapter;", "setAdapter$app_debug", "(Lbiz/filmeroo/premier/main/FilmAdapter;)V", "presenter", "Lbiz/filmeroo/premier/main/FilmPresenter;", "getPresenter$app_debug", "()Lbiz/filmeroo/premier/main/FilmPresenter;", "setPresenter$app_debug", "(Lbiz/filmeroo/premier/main/FilmPresenter;)V", "displayError", "", "displayResults", "results", "", "Lbiz/filmeroo/premier/api/ApiFilm;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setupView", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements biz.filmeroo.premier.main.FilmPresenter.View {
    @javax.inject.Inject()
    public biz.filmeroo.premier.main.FilmPresenter presenter;
    @javax.inject.Inject()
    public biz.filmeroo.premier.main.FilmAdapter adapter;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final biz.filmeroo.premier.main.FilmPresenter getPresenter$app_debug() {
        return null;
    }
    
    public final void setPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    biz.filmeroo.premier.main.FilmPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final biz.filmeroo.premier.main.FilmAdapter getAdapter$app_debug() {
        return null;
    }
    
    public final void setAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    biz.filmeroo.premier.main.FilmAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupView() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void displayResults(@org.jetbrains.annotations.NotNull()
    java.util.List<biz.filmeroo.premier.api.ApiFilm> results) {
    }
    
    @java.lang.Override()
    public void displayError() {
    }
}