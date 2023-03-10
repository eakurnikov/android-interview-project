// Generated by Dagger (https://dagger.dev).
package biz.filmeroo.premier.main;

import com.squareup.picasso.Picasso;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FilmAdapter_Factory implements Factory<FilmAdapter> {
  private final Provider<Picasso> picassoProvider;

  public FilmAdapter_Factory(Provider<Picasso> picassoProvider) {
    this.picassoProvider = picassoProvider;
  }

  @Override
  public FilmAdapter get() {
    return newInstance(picassoProvider.get());
  }

  public static FilmAdapter_Factory create(Provider<Picasso> picassoProvider) {
    return new FilmAdapter_Factory(picassoProvider);
  }

  public static FilmAdapter newInstance(Picasso picasso) {
    return new FilmAdapter(picasso);
  }
}
