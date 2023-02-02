package biz.filmeroo.premier.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0011H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lbiz/filmeroo/premier/detail/DetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lbiz/filmeroo/premier/detail/FilmDetailPresenter$View;", "()V", "picasso", "Lcom/squareup/picasso/Picasso;", "getPicasso$app_debug", "()Lcom/squareup/picasso/Picasso;", "setPicasso$app_debug", "(Lcom/squareup/picasso/Picasso;)V", "presenter", "Lbiz/filmeroo/premier/detail/FilmDetailPresenter;", "getPresenter$app_debug", "()Lbiz/filmeroo/premier/detail/FilmDetailPresenter;", "setPresenter$app_debug", "(Lbiz/filmeroo/premier/detail/FilmDetailPresenter;)V", "displayError", "", "displayMovie", "movie", "Lbiz/filmeroo/premier/api/ApiFilm;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "app_debug"})
public final class DetailActivity extends androidx.appcompat.app.AppCompatActivity implements biz.filmeroo.premier.detail.FilmDetailPresenter.View {
    @javax.inject.Inject()
    public biz.filmeroo.premier.detail.FilmDetailPresenter presenter;
    @javax.inject.Inject()
    public com.squareup.picasso.Picasso picasso;
    @org.jetbrains.annotations.NotNull()
    public static final biz.filmeroo.premier.detail.DetailActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ID = "extra_id";
    private java.util.HashMap _$_findViewCache;
    
    public DetailActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final biz.filmeroo.premier.detail.FilmDetailPresenter getPresenter$app_debug() {
        return null;
    }
    
    public final void setPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    biz.filmeroo.premier.detail.FilmDetailPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.picasso.Picasso getPicasso$app_debug() {
        return null;
    }
    
    public final void setPicasso$app_debug(@org.jetbrains.annotations.NotNull()
    com.squareup.picasso.Picasso p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void displayMovie(@org.jetbrains.annotations.NotNull()
    biz.filmeroo.premier.api.ApiFilm movie) {
    }
    
    @java.lang.Override()
    public void displayError() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lbiz/filmeroo/premier/detail/DetailActivity$Companion;", "", "()V", "EXTRA_ID", "", "start", "", "origin", "Landroid/app/Activity;", "id", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.app.Activity origin, long id) {
        }
    }
}