package biz.filmeroo.premier.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0005J\r\u0010\r\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u0000H\u0017\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\nH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lbiz/filmeroo/premier/base/Presenter;", "V", "Lbiz/filmeroo/premier/base/PresenterView;", "", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "view", "Lbiz/filmeroo/premier/base/PresenterView;", "addSubscription", "", "disposable", "Lio/reactivex/disposables/Disposable;", "getView", "()Lbiz/filmeroo/premier/base/PresenterView;", "removeSubscription", "start", "(Lbiz/filmeroo/premier/base/PresenterView;)V", "stop", "app_debug"})
public class Presenter<V extends biz.filmeroo.premier.base.PresenterView> {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private V view;
    
    public Presenter() {
        super();
    }
    
    @androidx.annotation.CallSuper()
    public void start(@org.jetbrains.annotations.NotNull()
    V view) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final V getView() {
        return null;
    }
    
    @androidx.annotation.CallSuper()
    public final void stop() {
    }
    
    @androidx.annotation.CallSuper()
    protected final void addSubscription(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    protected final void removeSubscription(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
}