package biz.filmeroo.premier.app;

import biz.filmeroo.premier.main.SearchActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = Binder_SearchActivity.SearchActivitySubcomponent.class)
public abstract class Binder_SearchActivity {
  private Binder_SearchActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SearchActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SearchActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface SearchActivitySubcomponent extends AndroidInjector<SearchActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SearchActivity> {}
  }
}
