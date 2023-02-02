package biz.filmeroo.premier.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbiz/filmeroo/premier/detail/FilmDetailPresenter;", "Lbiz/filmeroo/premier/base/Presenter;", "Lbiz/filmeroo/premier/detail/FilmDetailPresenter$View;", "filmRepository", "Lbiz/filmeroo/premier/main/FilmRepository;", "(Lbiz/filmeroo/premier/main/FilmRepository;)V", "loadMovie", "", "view", "movieId", "", "View", "app_debug"})
public final class FilmDetailPresenter extends biz.filmeroo.premier.base.Presenter<biz.filmeroo.premier.detail.FilmDetailPresenter.View> {
    private final biz.filmeroo.premier.main.FilmRepository filmRepository = null;
    
    @javax.inject.Inject()
    public FilmDetailPresenter(@org.jetbrains.annotations.NotNull()
    biz.filmeroo.premier.main.FilmRepository filmRepository) {
        super();
    }
    
    public final void loadMovie(@org.jetbrains.annotations.NotNull()
    biz.filmeroo.premier.detail.FilmDetailPresenter.View view, long movieId) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lbiz/filmeroo/premier/detail/FilmDetailPresenter$View;", "Lbiz/filmeroo/premier/base/PresenterView;", "displayError", "", "displayMovie", "movie", "Lbiz/filmeroo/premier/api/ApiFilm;", "app_debug"})
    public static abstract interface View extends biz.filmeroo.premier.base.PresenterView {
        
        public abstract void displayMovie(@org.jetbrains.annotations.NotNull()
        biz.filmeroo.premier.api.ApiFilm movie);
        
        public abstract void displayError();
    }
}