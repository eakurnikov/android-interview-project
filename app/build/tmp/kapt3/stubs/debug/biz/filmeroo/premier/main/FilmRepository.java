package biz.filmeroo.premier.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u0006J\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u00062\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lbiz/filmeroo/premier/main/FilmRepository;", "", "filmService", "Lbiz/filmeroo/premier/api/FilmService;", "(Lbiz/filmeroo/premier/api/FilmService;)V", "fetchMovie", "Lio/reactivex/Single;", "Lbiz/filmeroo/premier/api/ApiFilm;", "id", "", "fetchTopRated", "", "search", "query", "", "app_debug"})
public final class FilmRepository {
    private final biz.filmeroo.premier.api.FilmService filmService = null;
    
    @javax.inject.Inject()
    public FilmRepository(@org.jetbrains.annotations.NotNull()
    biz.filmeroo.premier.api.FilmService filmService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<biz.filmeroo.premier.api.ApiFilm>> fetchTopRated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<biz.filmeroo.premier.api.ApiFilm> fetchMovie(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<biz.filmeroo.premier.api.ApiFilm>> search(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
}