package biz.filmeroo.premier.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'\u00a8\u0006\r"}, d2 = {"Lbiz/filmeroo/premier/api/FilmService;", "", "movie", "Lio/reactivex/Single;", "Lbiz/filmeroo/premier/api/ApiFilm;", "movieId", "", "search", "Lbiz/filmeroo/premier/api/ApiFilmListResponse;", "query", "", "topRated", "Companion", "app_debug"})
public abstract interface FilmService {
    @org.jetbrains.annotations.NotNull()
    public static final biz.filmeroo.premier.api.FilmService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.themoviedb.org/3/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY_PARAM = "api_key";
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/top_rated")
    public abstract io.reactivex.Single<biz.filmeroo.premier.api.ApiFilmListResponse> topRated();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movie_id}")
    public abstract io.reactivex.Single<biz.filmeroo.premier.api.ApiFilm> movie(@retrofit2.http.Path(value = "movie_id")
    long movieId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/movie")
    public abstract io.reactivex.Single<biz.filmeroo.premier.api.ApiFilmListResponse> search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lbiz/filmeroo/premier/api/FilmService$Companion;", "", "()V", "API_KEY_PARAM", "", "BASE_URL", "buildImageUrl", "path", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://api.themoviedb.org/3/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY_PARAM = "api_key";
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String buildImageUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String path) {
            return null;
        }
    }
}