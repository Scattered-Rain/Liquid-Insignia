package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;

public class MapRenderer {
	
	private OrthogonalTiledMapRenderer renderer;
	private OrthographicCamera camera;
	
	public MapRenderer(){
		TmxMapLoader mapLoader = new TmxMapLoader();
		TiledMap map = mapLoader.load("mainHall.tmx");
		this.renderer = new OrthogonalTiledMapRenderer(map, 1);
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		this.camera = new OrthographicCamera(1, h/w);
		camera.position.x = 128;
		camera.position.y = 16*8;
		camera.zoom = 16*16;
		camera.update();
	}
	
	public void render(){
		renderer.setView(camera);
		renderer.render();
	}

}
