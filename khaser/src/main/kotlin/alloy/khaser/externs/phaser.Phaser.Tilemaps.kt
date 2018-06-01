//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Tilemaps")]
//package Phaser.Tilemaps
//
//import alloy.khaser.externs.BlendModes
//import alloy.khaser.externs.ScaleModes
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//
//external open class DynamicTilemapLayer(scene: Scene, tilemap: Tilemap, layerIndex: Number, tileset: Tileset, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */) : Phaser.GameObjects.GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.ComputedSize, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    open var isTilemap: Boolean = definedExternally
//    open var tilemap: Tilemap = definedExternally
//    open var layerIndex: Number = definedExternally
//    open var layer: LayerData = definedExternally
//    open var tileset: Tileset = definedExternally
//    open var culledTiles: Array<Any> = definedExternally
//    open fun calculateFacesAt(tileX: Number, tileY: Number): DynamicTilemapLayer = definedExternally
//    open fun calculateFacesWithin(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun createFromTiles(indexes: Number, replacements: Number, spriteConfig: Any, scene: Scene? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun createFromTiles(indexes: Number, replacements: Array<Any>, spriteConfig: Any, scene: Scene? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun createFromTiles(indexes: Array<Any>, replacements: Number, spriteConfig: Any, scene: Scene? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun createFromTiles(indexes: Array<Any>, replacements: Array<Any>, spriteConfig: Any, scene: Scene? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun cull(camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun copy(srcTileX: Number, srcTileY: Number, width: Number, height: Number, destTileX: Number, destTileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    override fun destroy(): Unit = definedExternally
//    open fun fill(index: Number, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun filterTiles(callback: Function<*>, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun findByIndex(index: Number, skip: Number? = definedExternally /* null */, reverse: Boolean? = definedExternally /* null */): Tile = definedExternally
//    open fun findTile(callback: Function<*>, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): Tile = definedExternally
//    open fun forEachTile(callback: Function<*>, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun getTileAt(tileX: Number, tileY: Number, nonNull: Boolean? = definedExternally /* null */): Tile = definedExternally
//    open fun getTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Tile = definedExternally
//    open fun getTilesWithin(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinShape(shape: Phaser.Geom.Circle, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinShape(shape: Phaser.Geom.Line, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinShape(shape: Phaser.Geom.Rectangle, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinShape(shape: Phaser.Geom.Triangle, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun hasTileAt(tileX: Number, tileY: Number): Boolean = definedExternally
//    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Boolean = definedExternally
//    open fun putTileAt(tile: Number, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): Tile = definedExternally
//    open fun putTileAt(tile: Tile, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): Tile = definedExternally
//    open fun putTileAtWorldXY(tile: Number, worldX: Number, worldY: Number, recalculateFaces: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Tile = definedExternally
//    open fun putTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number, recalculateFaces: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Tile = definedExternally
//    open fun putTilesAt(tile: Array<Number>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun putTilesAt(tile: Array<Array<Number>>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun putTilesAt(tile: Array<Tile>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun putTilesAt(tile: Array<Array<Tile>>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun randomize(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, indexes: Array<Number>? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun removeTileAt(tile: Number, tileX: Number, tileY: Number, replaceWithNull: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): Tile = definedExternally
//    open fun removeTileAt(tile: Tile, tileX: Number, tileY: Number, replaceWithNull: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): Tile = definedExternally
//    open fun removeTileAtWorldXY(tile: Number, worldX: Number, worldY: Number, replaceWithNull: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Tile = definedExternally
//    open fun removeTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number, replaceWithNull: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Tile = definedExternally
//    open fun renderDebug(graphics: Phaser.GameObjects.Graphics, styleConfig: Any): DynamicTilemapLayer = definedExternally
//    open fun replaceByIndex(findIndex: Number, newIndex: Number, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun setCollision(indexes: Number, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun setCollision(indexes: Array<Any>, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun setCollisionBetween(start: Number, stop: Number, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun setCollisionByProperty(properties: Any, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun setCollisionByExclusion(indexes: Array<Number>, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun setCollisionFromCollisionGroup(collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun setTileIndexCallback(indexes: Number, callback: Function<*>, callbackContext: Any): DynamicTilemapLayer = definedExternally
//    open fun setTileIndexCallback(indexes: Array<Any>, callback: Function<*>, callbackContext: Any): DynamicTilemapLayer = definedExternally
//    open fun setTileLocationCallback(tileX: Number, tileY: Number, width: Number, height: Number, callback: Function<*>, callbackContext: Any? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun shuffle(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun swapByIndex(tileA: Number, tileB: Number, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun tileToWorldX(tileX: Number, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun tileToWorldY(tileY: Number, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun tileToWorldXY(tileX: Number, tileY: Number, point: Phaser.Math.Vector2? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Phaser.Math.Vector2 = definedExternally
//    open fun weightedRandomize(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, weightedIndexes: Array<Any?>? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
//    open fun worldToTileX(worldX: Number, snapToFloor: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun worldToTileY(worldY: Number, snapToFloor: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun worldToTileXY(worldX: Number, worldY: Number, snapToFloor: Boolean? = definedExternally /* null */, point: Phaser.Math.Vector2? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Phaser.Math.Vector2 = definedExternally
//    override fun clearAlpha(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): Phaser.GameObjects.GameObject = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSize(width: Number, height: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var flipX: Boolean = definedExternally
//    override var flipY: Boolean = definedExternally
//    override fun toggleFlipX(): Phaser.GameObjects.GameObject = definedExternally
//    override fun toggleFlipY(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlipX(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlipY(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlip(x: Boolean, y: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun resetFlip(): Phaser.GameObjects.GameObject = definedExternally
//    open fun <O : Phaser.Math.Vector2> getCenter(output: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getTopLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getTopRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBottomLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBottomRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBounds(output: O? = definedExternally /* null */): O = definedExternally
//    override var originX: Number = definedExternally
//    override var originY: Number = definedExternally
//    override var displayOriginX: Number = definedExternally
//    override var displayOriginY: Number = definedExternally
//    override fun setOrigin(x: Number?, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setOriginFromFrame(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun updateDisplayOrigin(): Phaser.GameObjects.GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): Phaser.GameObjects.GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override var x: Number = definedExternally
//    override var y: Number = definedExternally
//    override var z: Number = definedExternally
//    override var w: Number = definedExternally
//    override var scaleX: Number = definedExternally
//    override var scaleY: Number = definedExternally
//    override var angle: Number = definedExternally
//    override var rotation: Number = definedExternally
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setRotation(radians: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAngle(degrees: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setX(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setY(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setZ(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setW(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//}
//external open class ImageCollection(name: String, firstgid: Number, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, margin: Number? = definedExternally /* null */, spacing: Number? = definedExternally /* null */, properties: Any? = definedExternally /* null */) {
//    open var name: String = definedExternally
//    open var firstgid: Number = definedExternally
//    open var imageWidth: Number = definedExternally
//    open var imageHeight: Number = definedExternally
//    open var imageMarge: Number = definedExternally
//    open var imageSpacing: Number = definedExternally
//    open var properties: Any = definedExternally
//    open var images: Array<Any> = definedExternally
//    open var total: Number = definedExternally
//    open fun containsImageIndex(imageIndex: Number): Boolean = definedExternally
//    open fun addImage(gid: Number, image: String): ImageCollection = definedExternally
//}
//external open class LayerData(config: Any? = definedExternally /* null */) {
//    open var name: String = definedExternally
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var tileWidth: Number = definedExternally
//    open var tileHeight: Number = definedExternally
//    open var baseTileWidth: Number = definedExternally
//    open var baseTileHeight: Number = definedExternally
//    open var widthInPixels: Number = definedExternally
//    open var heightInPixels: Number = definedExternally
//    open var alpha: Number = definedExternally
//    open var visible: Boolean = definedExternally
//    open var properties: Any = definedExternally
//    open var indexes: Array<Any> = definedExternally
//    open var collideIndexes: Array<Any> = definedExternally
//    open var callbacks: Array<Any> = definedExternally
//    open var bodies: Array<Any> = definedExternally
//    open var data: Array<Any> = definedExternally
//    open var tilemapLayer: dynamic /* DynamicTilemapLayer | StaticTilemapLayer */ = definedExternally
//}
//external open class MapData(config: Any? = definedExternally /* null */) {
//    open var name: String = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var tileWidth: Number = definedExternally
//    open var tileHeight: Number = definedExternally
//    open var widthInPixels: Number = definedExternally
//    open var heightInPixels: Number = definedExternally
//    open var format: Number = definedExternally
//    open var orientation: String = definedExternally
//    open var version: String = definedExternally
//    open var properties: Any = definedExternally
//    open var layers: Array<Any> = definedExternally
//    open var images: Array<Any> = definedExternally
//    open var objects: Any = definedExternally
//    open var collision: Any = definedExternally
//    open var tilesets: Array<Any> = definedExternally
//    open var imageCollections: Array<Any> = definedExternally
//    open var tiles: Array<Any> = definedExternally
//}
//external open class ObjectLayer(config: Any? = definedExternally /* null */) {
//    open var name: String = definedExternally
//    open var opacity: Number = definedExternally
//    open var properties: Any = definedExternally
//    open var propertyTypes: Any = definedExternally
//    open var type: String = definedExternally
//    open var visible: Boolean = definedExternally
//    open var objects: Array<Phaser.GameObjects.GameObject> = definedExternally
//}
//external fun ParseToTilemap(scene: Scene, key: String? = definedExternally /* null */, tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, data: Array<Array<Number>>? = definedExternally /* null */, insertNull: Boolean? = definedExternally /* null */): Tilemap = definedExternally
//external open class StaticTilemapLayer(scene: Scene, tilemap: Tilemap, layerIndex: Number, tileset: Tileset, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */) : Phaser.GameObjects.GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.ComputedSize, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible, Phaser.GameObjects.Components.ScrollFactor {
//    open var isTilemap: Boolean = definedExternally
//    open var tilemap: Tilemap = definedExternally
//    open var layerIndex: Number = definedExternally
//    open var layer: LayerData = definedExternally
//    open var tileset: Tileset = definedExternally
//    open var culledTiles: Array<Any> = definedExternally
//    open fun upload(camera: Phaser.Cameras.Scene2D.Camera): StaticTilemapLayer = definedExternally
//    open fun calculateFacesAt(tileX: Number, tileY: Number): StaticTilemapLayer = definedExternally
//    open fun calculateFacesWithin(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): StaticTilemapLayer = definedExternally
//    open fun createFromTiles(indexes: Number, replacements: Number, spriteConfig: Any, scene: Scene? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun createFromTiles(indexes: Number, replacements: Array<Any>, spriteConfig: Any, scene: Scene? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun createFromTiles(indexes: Array<Any>, replacements: Number, spriteConfig: Any, scene: Scene? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun createFromTiles(indexes: Array<Any>, replacements: Array<Any>, spriteConfig: Any, scene: Scene? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun cull(camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
//    override fun destroy(): Unit = definedExternally
//    open fun findByIndex(index: Number, skip: Number? = definedExternally /* null */, reverse: Boolean? = definedExternally /* null */): Tile = definedExternally
//    open fun findTile(callback: Function<*>, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): Tile = definedExternally
//    open fun filterTiles(callback: Function<*>, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun forEachTile(callback: Function<*>, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): StaticTilemapLayer = definedExternally
//    open fun getTileAt(tileX: Number, tileY: Number, nonNull: Boolean? = definedExternally /* null */): Tile = definedExternally
//    open fun getTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Tile = definedExternally
//    open fun getTilesWithin(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinShape(shape: Phaser.Geom.Circle, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinShape(shape: Phaser.Geom.Line, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinShape(shape: Phaser.Geom.Rectangle, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinShape(shape: Phaser.Geom.Triangle, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun hasTileAt(tileX: Number, tileY: Number): Boolean = definedExternally
//    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Boolean = definedExternally
//    open fun renderDebug(graphics: Phaser.GameObjects.Graphics, styleConfig: Any): StaticTilemapLayer = definedExternally
//    open fun setCollision(indexes: Number, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): StaticTilemapLayer = definedExternally
//    open fun setCollision(indexes: Array<Any>, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): StaticTilemapLayer = definedExternally
//    open fun setCollisionBetween(start: Number, stop: Number, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): StaticTilemapLayer = definedExternally
//    open fun setCollisionByProperty(properties: Any, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): StaticTilemapLayer = definedExternally
//    open fun setCollisionByExclusion(indexes: Array<Number>, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): StaticTilemapLayer = definedExternally
//    open fun setTileIndexCallback(indexes: Number, callback: Function<*>, callbackContext: Any): StaticTilemapLayer = definedExternally
//    open fun setTileIndexCallback(indexes: Array<Any>, callback: Function<*>, callbackContext: Any): StaticTilemapLayer = definedExternally
//    open fun setCollisionFromCollisionGroup(collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): StaticTilemapLayer = definedExternally
//    open fun setTileLocationCallback(tileX: Number, tileY: Number, width: Number, height: Number, callback: Function<*>, callbackContext: Any? = definedExternally /* null */): StaticTilemapLayer = definedExternally
//    open fun tileToWorldX(tileX: Number, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun tileToWorldY(tileY: Number, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun tileToWorldXY(tileX: Number, tileY: Number, point: Phaser.Math.Vector2? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Phaser.Math.Vector2 = definedExternally
//    open fun worldToTileX(worldX: Number, snapToFloor: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun worldToTileY(worldY: Number, snapToFloor: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun worldToTileXY(worldX: Number, worldY: Number, snapToFloor: Boolean? = definedExternally /* null */, point: Phaser.Math.Vector2? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Phaser.Math.Vector2 = definedExternally
//    override fun clearAlpha(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): Phaser.GameObjects.GameObject = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSize(width: Number, height: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var flipX: Boolean = definedExternally
//    override var flipY: Boolean = definedExternally
//    override fun toggleFlipX(): Phaser.GameObjects.GameObject = definedExternally
//    override fun toggleFlipY(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlipX(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlipY(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlip(x: Boolean, y: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun resetFlip(): Phaser.GameObjects.GameObject = definedExternally
//    open fun <O : Phaser.Math.Vector2> getCenter(output: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getTopLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getTopRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBottomLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBottomRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBounds(output: O? = definedExternally /* null */): O = definedExternally
//    override var originX: Number = definedExternally
//    override var originY: Number = definedExternally
//    override var displayOriginX: Number = definedExternally
//    override var displayOriginY: Number = definedExternally
//    override fun setOrigin(x: Number?, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setOriginFromFrame(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun updateDisplayOrigin(): Phaser.GameObjects.GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): Phaser.GameObjects.GameObject = definedExternally
//    override var x: Number = definedExternally
//    override var y: Number = definedExternally
//    override var z: Number = definedExternally
//    override var w: Number = definedExternally
//    override var scaleX: Number = definedExternally
//    override var scaleY: Number = definedExternally
//    override var angle: Number = definedExternally
//    override var rotation: Number = definedExternally
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setRotation(radians: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAngle(degrees: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setX(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setY(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setZ(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setW(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//}
//external open class Tile(layer: LayerData, index: Number, x: Number, y: Number, width: Number, height: Number, baseWidth: Number, baseHeight: Number) : Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.Visible {
//    open var layer: LayerData = definedExternally
//    open var index: Number = definedExternally
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var baseWidth: Number = definedExternally
//    open var baseHeight: Number = definedExternally
//    open var pixelX: Number = definedExternally
//    open var pixelY: Number = definedExternally
//    open var properties: Any = definedExternally
//    open var rotation: Number = definedExternally
//    open var collideLeft: Boolean = definedExternally
//    open var collideRight: Boolean = definedExternally
//    open var collideUp: Boolean = definedExternally
//    open var collideDown: Boolean = definedExternally
//    open var faceLeft: Boolean = definedExternally
//    open var faceRight: Boolean = definedExternally
//    open var faceTop: Boolean = definedExternally
//    open var faceBottom: Boolean = definedExternally
//    open var collisionCallback: Function<*> = definedExternally
//    open var collisionCallbackContext: Any = definedExternally
//    open var tint: Number = definedExternally
//    open var physics: Any = definedExternally
//    open fun containsPoint(x: Number, y: Number): Boolean = definedExternally
//    open fun copy(tile: Tile): Tile = definedExternally
//    open fun getCollisionGroup(): Any = definedExternally
//    open fun getTileData(): Any = definedExternally
//    open fun getLeft(camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun getRight(camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun getTop(camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun getBottom(camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun getBounds(camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, output: Any? = definedExternally /* null */): dynamic /* Any? | Phaser.Geom.Rectangle */ = definedExternally
//    open fun getCenterX(camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun getCenterY(camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
//    open fun destroy(): Unit = definedExternally
//    open fun intersects(x: Number, y: Number, right: Number, bottom: Number): Boolean = definedExternally
//    open fun isInteresting(collides: Boolean, faces: Boolean): Boolean = definedExternally
//    open fun resetCollision(recalculateFaces: Boolean? = definedExternally /* null */): Tile = definedExternally
//    open fun resetFaces(): Tile = definedExternally
//    open fun setCollision(left: Boolean, right: Boolean? = definedExternally /* null */, up: Boolean? = definedExternally /* null */, down: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): Tile = definedExternally
//    open fun setCollisionCallback(callback: Function<*>, context: Any): Tile = definedExternally
//    open fun setSize(tileWidth: Number, tileHeight: Number, baseWidth: Number, baseHeight: Number): Tile = definedExternally
//    open fun updatePixelXY(): Tile = definedExternally
//    open var canCollide: Boolean = definedExternally
//    open var collides: Boolean = definedExternally
//    open var hasInterestingFace: Boolean = definedExternally
//    open var tileset: Tileset = definedExternally
//    open var tilemapLayer: dynamic /* DynamicTilemapLayer | StaticTilemapLayer */ = definedExternally
//    open var tilemap: Tilemap = definedExternally
//    override fun clearAlpha(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var flipX: Boolean = definedExternally
//    override var flipY: Boolean = definedExternally
//    override fun toggleFlipX(): Phaser.GameObjects.GameObject = definedExternally
//    override fun toggleFlipY(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlipX(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlipY(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlip(x: Boolean, y: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun resetFlip(): Phaser.GameObjects.GameObject = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//}
//external open class Tilemap(scene: Scene, mapData: MapData) {
//    open var scene: Scene = definedExternally
//    open var tileWidth: Number = definedExternally
//    open var tileHeight: Number = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var orientation: String = definedExternally
//    open var format: Number = definedExternally
//    open var version: Number = definedExternally
//    open var properties: Any = definedExternally
//    open var widthInPixels: Number = definedExternally
//    open var heightInPixels: Number = definedExternally
//    open var imageCollections: Array<ImageCollection> = definedExternally
//    open var images: Array<Any> = definedExternally
//    open var layers: Array<LayerData> = definedExternally
//    open var tilesets: Array<Tileset> = definedExternally
//    open var objects: Array<ObjectLayer> = definedExternally
//    open var currentLayerIndex: Number = definedExternally
//    open fun addTilesetImage(tilesetName: String, key: String? = definedExternally /* null */, tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */, tileMargin: Number? = definedExternally /* null */, tileSpacing: Number? = definedExternally /* null */, gid: Number? = definedExternally /* null */): Tileset = definedExternally
//    open fun convertLayerToStatic(layer: String? = definedExternally /* null */): StaticTilemapLayer = definedExternally
//    open fun convertLayerToStatic(layer: Number? = definedExternally /* null */): StaticTilemapLayer = definedExternally
//    open fun convertLayerToStatic(layer: DynamicTilemapLayer? = definedExternally /* null */): StaticTilemapLayer = definedExternally
//    open fun copy(): Tilemap = definedExternally
//    open fun createBlankDynamicLayer(name: String, tileset: Tileset, width: Number, height: Number, tileWidth: Number, tileHeight: Number): DynamicTilemapLayer = definedExternally
//    open fun createDynamicLayer(layerID: String, tileset: Tileset, x: Number, y: Number): DynamicTilemapLayer = definedExternally
//    open fun createDynamicLayer(layerID: Number, tileset: Tileset, x: Number, y: Number): DynamicTilemapLayer = definedExternally
//    open fun createFromObjects(name: String, id: String, spriteConfig: Any, scene: Scene? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun createFromObjects(name: String, id: Number, spriteConfig: Any, scene: Scene? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun createFromTiles(indexes: Number, replacements: Number, spriteConfig: Any, scene: Scene? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun createFromTiles(indexes: Number, replacements: Array<Any>, spriteConfig: Any, scene: Scene? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun createFromTiles(indexes: Array<Any>, replacements: Number, spriteConfig: Any, scene: Scene? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun createFromTiles(indexes: Array<Any>, replacements: Array<Any>, spriteConfig: Any, scene: Scene? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite> = definedExternally
//    open fun createStaticLayer(layerID: String, tileset: Tileset, x: Number, y: Number): StaticTilemapLayer = definedExternally
//    open fun createStaticLayer(layerID: Number, tileset: Tileset, x: Number, y: Number): StaticTilemapLayer = definedExternally
//    open fun destroy(): Unit = definedExternally
//    open fun fill(index: Number, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun filterObjects(objectLayer: String, callback: (value: Phaser.GameObjects.GameObject, index: Number, array: Array<Phaser.GameObjects.GameObject>) -> Unit, context: Any? = definedExternally /* null */): Array<Phaser.GameObjects.GameObject> = definedExternally
//    open fun filterObjects(objectLayer: ObjectLayer, callback: (value: Phaser.GameObjects.GameObject, index: Number, array: Array<Phaser.GameObjects.GameObject>) -> Unit, context: Any? = definedExternally /* null */): Array<Phaser.GameObjects.GameObject> = definedExternally
//    open fun filterTiles(callback: Function<*>, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun findByIndex(index: Number, skip: Number? = definedExternally /* null */, reverse: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
//    open fun findObject(objectLayer: String, callback: (value: Phaser.GameObjects.GameObject, index: Number, array: Array<Phaser.GameObjects.GameObject>) -> Unit, context: Any? = definedExternally /* null */): Phaser.GameObjects.GameObject = definedExternally
//    open fun findObject(objectLayer: ObjectLayer, callback: (value: Phaser.GameObjects.GameObject, index: Number, array: Array<Phaser.GameObjects.GameObject>) -> Unit, context: Any? = definedExternally /* null */): Phaser.GameObjects.GameObject = definedExternally
//    open fun findTile(callback: (value: Tile, index: Number, array: Array<Tile>) -> Unit, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
//    open fun forEachTile(callback: (value: Tile, index: Number, array: Array<Tile>) -> Unit, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun getImageIndex(name: String): Number = definedExternally
//    open fun getIndex(location: Array<Any>, name: String): Number = definedExternally
//    open fun getLayer(layer: String? = definedExternally /* null */): LayerData = definedExternally
//    open fun getLayer(layer: Number? = definedExternally /* null */): LayerData = definedExternally
//    open fun getLayer(layer: DynamicTilemapLayer? = definedExternally /* null */): LayerData = definedExternally
//    open fun getLayer(layer: StaticTilemapLayer? = definedExternally /* null */): LayerData = definedExternally
//    open fun getObjectLayer(name: String? = definedExternally /* null */): ObjectLayer = definedExternally
//    open fun getLayerIndex(layer: String? = definedExternally /* null */): Number = definedExternally
//    open fun getLayerIndex(layer: Number? = definedExternally /* null */): Number = definedExternally
//    open fun getLayerIndex(layer: DynamicTilemapLayer? = definedExternally /* null */): Number = definedExternally
//    open fun getLayerIndex(layer: StaticTilemapLayer? = definedExternally /* null */): Number = definedExternally
//    open fun getLayerIndexByName(name: String): Number = definedExternally
//    open fun getTileAt(tileX: Number, tileY: Number, nonNull: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
//    open fun getTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
//    open fun getTilesWithin(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinShape(shape: Phaser.Geom.Circle, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinShape(shape: Phaser.Geom.Line, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinShape(shape: Phaser.Geom.Rectangle, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinShape(shape: Phaser.Geom.Triangle, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number, filteringOptions: Any? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
//    open fun getTilesetIndex(name: String): Number = definedExternally
//    open fun hasTileAt(tileX: Number, tileY: Number, layer: LayerData? = definedExternally /* null */): Boolean = definedExternally
//    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Boolean = definedExternally
//    open var layer: LayerData = definedExternally
//    open fun putTileAt(tile: Number, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
//    open fun putTileAt(tile: Tile, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
//    open fun putTileAtWorldXY(tile: Number, worldX: Number, worldY: Number, recalculateFaces: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
//    open fun putTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number, recalculateFaces: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
//    open fun putTilesAt(tile: Array<Number>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun putTilesAt(tile: Array<Array<Number>>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun putTilesAt(tile: Array<Tile>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun putTilesAt(tile: Array<Array<Tile>>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun randomize(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, indexes: Array<Number>? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun calculateFacesAt(tileX: Number, tileY: Number, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun calculateFacesWithin(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun removeAllLayers(): Tilemap = definedExternally
//    open fun removeTileAt(tile: Number, tileX: Number, tileY: Number, replaceWithNull: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
//    open fun removeTileAt(tile: Tile, tileX: Number, tileY: Number, replaceWithNull: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
//    open fun removeTileAtWorldXY(tile: Number, worldX: Number, worldY: Number, replaceWithNull: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
//    open fun removeTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number, replaceWithNull: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
//    open fun renderDebug(graphics: Phaser.GameObjects.Graphics, styleConfig: Any, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun replaceByIndex(findIndex: Number, newIndex: Number, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setCollision(indexes: Number, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setCollision(indexes: Array<Any>, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setCollisionBetween(start: Number, stop: Number, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setCollisionByProperty(properties: Any, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setCollisionByExclusion(indexes: Array<Number>, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setCollisionFromCollisionGroup(collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setTileIndexCallback(indexes: Number, callback: Function<*>, callbackContext: Any, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setTileIndexCallback(indexes: Array<Any>, callback: Function<*>, callbackContext: Any, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setTileLocationCallback(tileX: Number, tileY: Number, width: Number, height: Number, callback: Function<*>, callbackContext: Any? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setLayer(layer: String? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setLayer(layer: Number? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setLayer(layer: DynamicTilemapLayer? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setLayer(layer: StaticTilemapLayer? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setBaseTileSize(tileWidth: Number, tileHeight: Number): Tilemap = definedExternally
//    open fun setLayerTileSize(tileWidth: Number, tileHeight: Number, layer: String? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setLayerTileSize(tileWidth: Number, tileHeight: Number, layer: Number? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setLayerTileSize(tileWidth: Number, tileHeight: Number, layer: DynamicTilemapLayer? = definedExternally /* null */): Tilemap = definedExternally
//    open fun setLayerTileSize(tileWidth: Number, tileHeight: Number, layer: StaticTilemapLayer? = definedExternally /* null */): Tilemap = definedExternally
//    open fun shuffle(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun swapByIndex(tileA: Number, tileB: Number, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun tileToWorldX(tileX: Number, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Number = definedExternally
//    open fun tileToWorldY(tileY: Number, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Number = definedExternally
//    open fun tileToWorldXY(tileX: Number, tileY: Number, point: Phaser.Math.Vector2? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Phaser.Math.Vector2 = definedExternally
//    open fun weightedRandomize(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, weightedIndexes: Array<Any?>? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
//    open fun worldToTileX(worldX: Number, snapToFloor: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Number = definedExternally
//    open fun worldToTileY(worldY: Number, snapToFloor: Boolean? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Number = definedExternally
//    open fun worldToTileXY(worldX: Number, worldY: Number, snapToFloor: Boolean? = definedExternally /* null */, point: Phaser.Math.Vector2? = definedExternally /* null */, camera: Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Phaser.Math.Vector2 = definedExternally
//    open fun convertLayerToStatic(): StaticTilemapLayer = definedExternally
//    open fun getLayer(): LayerData = definedExternally
//    open fun getLayerIndex(): Number = definedExternally
//    open fun setLayer(): Tilemap = definedExternally
//    open fun setLayerTileSize(tileWidth: Number, tileHeight: Number): Tilemap = definedExternally
//}
//external open class Tileset(name: String, firstgid: Number, tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */, tileMargin: Number? = definedExternally /* null */, tileSpacing: Number? = definedExternally /* null */, tileProperties: Any? = definedExternally /* null */, tileData: Any? = definedExternally /* null */) {
//    open var name: String = definedExternally
//    open var firstgid: Number = definedExternally
//    open var tileWidth: Number = definedExternally
//    open var tileHeight: Number = definedExternally
//    open var tileMargin: Number = definedExternally
//    open var tileSpacing: Number = definedExternally
//    open var tileProperties: Any = definedExternally
//    open var tileData: Any = definedExternally
//    open var image: Phaser.Textures.Texture = definedExternally
//    open var rows: Number = definedExternally
//    open var columns: Number = definedExternally
//    open var total: Number = definedExternally
//    open var texCoordinates: Array<Any?> = definedExternally
//    open fun getTileProperties(tileIndex: Number): Any? = definedExternally
//    open fun getTileData(tileIndex: Number): Any? = definedExternally
//    open fun getTileCollisionGroup(tileIndex: Number): Any = definedExternally
//    open fun containsTileIndex(tileIndex: Number): Boolean = definedExternally
//    open fun getTileTextureCoordinates(tileIndex: Number): Any = definedExternally
//    open fun setImage(texture: Phaser.Textures.Texture): Tileset = definedExternally
//    open fun setTileSize(tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */): Tileset = definedExternally
//    open fun setSpacing(margin: Number? = definedExternally /* null */, spacing: Number? = definedExternally /* null */): Tileset = definedExternally
//    open fun updateTileData(imageWidth: Number, imageHeight: Number): Tileset = definedExternally
//}
