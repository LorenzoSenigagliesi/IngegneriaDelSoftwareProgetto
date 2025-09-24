package org.example.gui;

import com.gluonhq.maps.MapLayer;
import com.gluonhq.maps.MapPoint;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Pair;

public class CustomMapLayer extends MapLayer {

    @Override
    protected void layoutLayer() {
        Pair<MapPoint, Node>[] points = new Pair[1];
        for (Pair<MapPoint, Node> candidate : points) {
            MapPoint point = new MapPoint(30,31);
            Node icon = new Circle(5, Color.RED);
            Point2D mapPoint = getMapPoint(point.getLatitude(), point.getLongitude());
            icon.setVisible(true);
            icon.setTranslateX(mapPoint.getX());
            icon.setTranslateY(mapPoint.getY());
        }
    }
}
