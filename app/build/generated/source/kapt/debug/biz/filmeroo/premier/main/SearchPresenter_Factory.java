// Generated by Dagger (https://dagger.dev).
package biz.filmeroo.premier.main;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchPresenter_Factory implements Factory<SearchPresenter> {
  private final Provider<FilmRepository> filmRepositoryProvider;

  public SearchPresenter_Factory(Provider<FilmRepository> filmRepositoryProvider) {
    this.filmRepositoryProvider = filmRepositoryProvider;
  }

  @Override
  public SearchPresenter get() {
    return newInstance(filmRepositoryProvider.get());
  }

  public static SearchPresenter_Factory create(Provider<FilmRepository> filmRepositoryProvider) {
    return new SearchPresenter_Factory(filmRepositoryProvider);
  }

  public static SearchPresenter newInstance(FilmRepository filmRepository) {
    return new SearchPresenter(filmRepository);
  }
}
