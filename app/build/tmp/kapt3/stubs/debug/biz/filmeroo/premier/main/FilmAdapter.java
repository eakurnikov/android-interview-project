package biz.filmeroo.premier.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0015\u0016B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\n2\n\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u001a\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bR\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lbiz/filmeroo/premier/main/FilmAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lbiz/filmeroo/premier/api/ApiFilm;", "Lbiz/filmeroo/premier/main/FilmAdapter$Holder;", "picasso", "Lcom/squareup/picasso/Picasso;", "(Lcom/squareup/picasso/Picasso;)V", "onClick", "Lkotlin/Function1;", "", "", "getItemId", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnClick", "Companion", "Holder", "app_debug"})
public final class FilmAdapter extends androidx.recyclerview.widget.ListAdapter<biz.filmeroo.premier.api.ApiFilm, biz.filmeroo.premier.main.FilmAdapter.Holder> {
    private final com.squareup.picasso.Picasso picasso = null;
    private kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onClick;
    @org.jetbrains.annotations.NotNull()
    public static final biz.filmeroo.premier.main.FilmAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<biz.filmeroo.premier.api.ApiFilm> diffCallback = null;
    
    @javax.inject.Inject()
    public FilmAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.picasso.Picasso picasso) {
        super(null);
    }
    
    public final void setOnClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onClick) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public biz.filmeroo.premier.main.FilmAdapter.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    biz.filmeroo.premier.main.FilmAdapter.Holder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lbiz/filmeroo/premier/main/FilmAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lbiz/filmeroo/premier/main/FilmAdapter;Landroid/view/View;)V", "bind", "", "item", "Lbiz/filmeroo/premier/api/ApiFilm;", "app_debug"})
    public final class Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public Holder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        biz.filmeroo.premier.api.ApiFilm item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lbiz/filmeroo/premier/main/FilmAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lbiz/filmeroo/premier/api/ApiFilm;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}