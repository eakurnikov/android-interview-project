package biz.filmeroo.premier.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lbiz/filmeroo/premier/main/SearchPresenter;", "Lbiz/filmeroo/premier/base/Presenter;", "Lbiz/filmeroo/premier/main/SearchPresenter$View;", "filmRepository", "Lbiz/filmeroo/premier/main/FilmRepository;", "(Lbiz/filmeroo/premier/main/FilmRepository;)V", "updateQuery", "", "query", "", "View", "app_debug"})
public final class SearchPresenter extends biz.filmeroo.premier.base.Presenter<biz.filmeroo.premier.main.SearchPresenter.View> {
    private final biz.filmeroo.premier.main.FilmRepository filmRepository = null;
    
    @javax.inject.Inject()
    public SearchPresenter(@org.jetbrains.annotations.NotNull()
    biz.filmeroo.premier.main.FilmRepository filmRepository) {
        super();
    }
    
    public final void updateQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lbiz/filmeroo/premier/main/SearchPresenter$View;", "Lbiz/filmeroo/premier/base/PresenterView;", "displayResults", "", "results", "", "Lbiz/filmeroo/premier/api/ApiFilm;", "app_debug"})
    public static abstract interface View extends biz.filmeroo.premier.base.PresenterView {
        
        public abstract void displayResults(@org.jetbrains.annotations.NotNull()
        java.util.List<biz.filmeroo.premier.api.ApiFilm> results);
    }
}