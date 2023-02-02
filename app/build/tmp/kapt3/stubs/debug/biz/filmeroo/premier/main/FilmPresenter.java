package biz.filmeroo.premier.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lbiz/filmeroo/premier/main/FilmPresenter;", "Lbiz/filmeroo/premier/base/Presenter;", "Lbiz/filmeroo/premier/main/FilmPresenter$View;", "filmRepository", "Lbiz/filmeroo/premier/main/FilmRepository;", "(Lbiz/filmeroo/premier/main/FilmRepository;)V", "start", "", "view", "View", "app_debug"})
public final class FilmPresenter extends biz.filmeroo.premier.base.Presenter<biz.filmeroo.premier.main.FilmPresenter.View> {
    private final biz.filmeroo.premier.main.FilmRepository filmRepository = null;
    
    @javax.inject.Inject()
    public FilmPresenter(@org.jetbrains.annotations.NotNull()
    biz.filmeroo.premier.main.FilmRepository filmRepository) {
        super();
    }
    
    @java.lang.Override()
    public void start(@org.jetbrains.annotations.NotNull()
    biz.filmeroo.premier.main.FilmPresenter.View view) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&\u00a8\u0006\b"}, d2 = {"Lbiz/filmeroo/premier/main/FilmPresenter$View;", "Lbiz/filmeroo/premier/base/PresenterView;", "displayError", "", "displayResults", "results", "", "Lbiz/filmeroo/premier/api/ApiFilm;", "app_debug"})
    public static abstract interface View extends biz.filmeroo.premier.base.PresenterView {
        
        public abstract void displayResults(@org.jetbrains.annotations.NotNull()
        java.util.List<biz.filmeroo.premier.api.ApiFilm> results);
        
        public abstract void displayError();
    }
}