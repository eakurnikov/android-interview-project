package biz.filmeroo.premier.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\n \t*\u0004\u0018\u00010\u00120\u0012H\u0007J\u0018\u0010\u0013\u001a\n \t*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0007\u00a8\u0006\u0015"}, d2 = {"Lbiz/filmeroo/premier/app/AppModule;", "", "()V", "createAuthInterceptor", "Lokhttp3/Interceptor;", "resources", "Landroid/content/res/Resources;", "provideAppContext", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "application", "Lbiz/filmeroo/premier/app/PremierApp;", "provideFilmService", "Lbiz/filmeroo/premier/api/FilmService;", "client", "Lokhttp3/OkHttpClient;", "provideOkHttpClient", "providePicasso", "Lcom/squareup/picasso/Picasso;", "provideResource", "context", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @dagger.Provides()
    public final android.content.Context provideAppContext(@org.jetbrains.annotations.NotNull()
    biz.filmeroo.premier.app.PremierApp application) {
        return null;
    }
    
    @dagger.Provides()
    public final android.content.res.Resources provideResource(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final biz.filmeroo.premier.api.FilmService provideFilmService(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
        return null;
    }
    
    private final okhttp3.Interceptor createAuthInterceptor(android.content.res.Resources resources) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.squareup.picasso.Picasso providePicasso() {
        return null;
    }
}