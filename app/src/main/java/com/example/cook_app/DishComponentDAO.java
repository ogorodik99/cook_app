package com.example.cook_app;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.google.common.base.Joiner;

import org.slovenlypolygon.cookit.components.entitys.Component;
import org.slovenlypolygon.cookit.components.entitys.ComponentType;
import org.slovenlypolygon.cookit.dishes.entitys.Dish;
import org.slovenlypolygon.cookit.dishes.entitys.FrontendDish;
import org.slovenlypolygon.cookit.dishes.stepbystep.Step;
import org.slovenlypolygon.cookit.shoppinglists.ShoppingList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import javax.annotation.Nonnull;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class DishComponentDAO {
    private final SQLiteDatabase database;

    public DishComponentDAO(SQLiteDatabase database) {
        this.database = database;
    }

}
