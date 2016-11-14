
# LessItemFoldLayout
Android ItemFoldLayout，可以很便捷的实现点击Menu展开Item的抽屉效果。使用场景：例如，在App的个人设置界面。
###使用方式：
####xml文件:
#####<com.example.song.foldlayout.FoldLayout
     android:id="@+id/foldlayout1"
     android:layout_width="match_parent"
     android:layout_height="wrap_content"
     app:layoutId="@layout/layout_menu_data"//菜单布局，自定义
     app:animationTime="1000"//动画时间，默认300毫秒
     />
####定制Item布局，layout_item:
#####<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
#####    android:orientation="vertical"
#####    android:layout_width="match_parent"
#####    android:layout_height="wrap_content">
#####    <TextView
#####        android:layout_width="match_parent"
#####        android:layout_height="50dp"
#####        android:drawablePadding="5dp"
#####        android:paddingLeft="10dp"
#####        android:paddingRight="10dp"
#####        android:layout_marginLeft="10dp"
#####       android:gravity="center_vertical"
#####        android:text="Songlcy"
#####       android:background="@drawable/item_bg"
#####       android:drawableLeft="@drawable/love"
#####       android:drawableRight="@drawable/arrow"
#####        />
#####</LinearLayout>
####Activity:
#####        /**
#####         * 在Menu下添加两个Item
#####         */
#####        List<View> views = new ArrayList<>();
#####        for (int i = 0;i<2;i++) {
#####            views.add(getLayoutInflater().inflate(R.layout.layout_item,null));
#####        }
#####        foldlayout.addItemView(views);

####注册Item点击事件
#####        /**
#####         * 设置Item的单击事件
#####         */
#####        foldlayout.setOnItemClickListener(new FoldLayout.OnItemClickListener() {
#####            @Override
#####            public void onItemClick(View view, int position) {
#####                Toast.makeText(MainActivity.this, "点击了第"+position+"个", Toast.LENGTH_SHORT).show();
#####            }
#####        });
