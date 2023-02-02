// Generated by Dagger (https://dagger.dev).
package biz.filmeroo.premier.main;

import biz.filmeroo.premier.api.FilmService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FilmRepository_Factory implements Factory<FilmRepository> {
  private final Provider<FilmService> filmServiceProvider;

  public FilmRepository_Factory(Provider<FilmService> filmServiceProvider) {
    this.filmServiceProvider = filmServiceProvider;
  }

  @Override
  public FilmRepository get() {
    return newInstance(filmServiceProvider.get());
  }

  public static FilmRepository_Factory create(Provider<FilmService> filmServiceProvider) {
    return new FilmRepository_Factory(filmServiceProvider);
  }

  public static FilmRepository newInstance(FilmService filmService) {
    return new FilmRepository(filmService);
  }
}