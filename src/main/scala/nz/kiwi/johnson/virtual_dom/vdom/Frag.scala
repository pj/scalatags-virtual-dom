package nz.kiwi.johnson.virtual_dom.vdom

import scalatags.generic
import nz.kiwi.johnson.virtual_dom.VirtualNode
import nz.kiwi.johnson.virtual_dom.VirtualDomBase
import nz.kiwi.johnson.virtual_dom.libraryInterface

trait Frag extends generic.Frag[VirtualNode, VirtualNode, VirtualDomBase]{
  def render: VirtualDomBase
  
  def applyTo(b: VirtualNode) = {
    val node = this.render
    
    b.addChild(node)
  }
}