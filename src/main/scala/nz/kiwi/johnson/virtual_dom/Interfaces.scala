package nz.kiwi.johnson.virtual_dom

/*
 * Interface to the underlying virtual-dom library.
 */
import scala.scalajs.js
import org.scalajs.dom.Element
import scala.scalajs.js.annotation.JSName

trait VirtualDomBase extends js.Object

trait VirtualNode extends VirtualDomBase {
  var tagName: String
  var properties: js.Dynamic
  var children: js.Dynamic
  var count: Int
  
  // various additions to make adding children easier
  def addChild(child: VirtualDomBase)
  
  def addAttribute(name: String, value: String)
  
  def addStyle(name: String, value: String)
  
  def addText(text: String)
}

class VirtualText(var text: String) extends VirtualDomBase {
}

trait PatchObject extends js.Object

@JSName("virtualDom")
object libraryInterface extends js.Object {
  
  // function h(tagName, properties, children) {
  def h(tagName: String, properties: js.Object, children: Array[VirtualNode]): VirtualNode = ???

  // function h(tagName, properties, children) {
  def h(tagName: String, properties: js.Object, children: Array[String]): VirtualNode = ???
  
  // function h(tagName, properties, children) {
  def h(tagName: String, properties: js.Object, children: String): VirtualNode = ???
  
  // function diff(a, b) {
  def diff(a: VirtualNode, b: VirtualNode): PatchObject = ???
  
  // function patch(rootNode, patches) {
  def patch(rootNode: Element, patches: js.Any): Element = ???
  
  // function createElement(vnode, opts) {
  def createElement(vnode: VirtualNode, opts: PatchObject): Element = ???
  
  def createElement(vnode: VirtualNode): Element = ???
}
