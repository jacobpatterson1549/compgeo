package com.jpatterson.school.compGeo.algorithm;

import com.jpatterson.school.compGeo.Point;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DelaunayTriangulation
{
//	private final Collection<Point> points;

	public DelaunayTriangulation()
	{
//		this.points = points;
	}

	public void addPoint(Point point)
	{

	}

	public List<List<Point>> getTriangulationTriangles()
	{
		List<Point> basicTriangle = Arrays.asList(new Point(1, 1), new Point(50, 1), new Point(1, 50));
		return Collections.singletonList(basicTriangle);
	}
}
