package biz.filmeroo.premier.app;

import biz.filmeroo.premier.detail.DetailActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = Binder_DetailActivity$app_debug.DetailActivitySubcomponent.class)
public abstract class Binder_DetailActivity$app_debug {
  private Binder_DetailActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(DetailActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DetailActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface DetailActivitySubcomponent extends AndroidInjector<DetailActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DetailActivity> {}
  }
}
