package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.client.navigation.NavigationManager;
import org.dashbuilder.client.navigation.impl.NavigationManagerImpl;
import org.dashbuilder.client.navigation.layout.editor.AbstractNavDragComponent;
import org.dashbuilder.client.navigation.layout.editor.NavDragComponent;
import org.dashbuilder.client.navigation.layout.editor.NavTabListDragComponent;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginManager;
import org.dashbuilder.client.navigation.widget.NavTabListWidget;
import org.dashbuilder.client.plugins.RuntimePerspectivePluginManager;
import org.dashbuilder.navigation.event.NavTreeChangedEvent;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.bus.client.api.Subscription;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponent;

public class Type_factory__o_d_c_n_l_e_NavTabListDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTabListDragComponent> { public Type_factory__o_d_c_n_l_e_NavTabListDragComponent__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavTabListDragComponent.class, "Type_factory__o_d_c_n_l_e_NavTabListDragComponent__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavTabListDragComponent.class, AbstractNavDragComponent.class, Object.class, NavDragComponent.class, LayoutDragComponent.class });
  }

  public NavTabListDragComponent createInstance(final ContextManager contextManager) {
    final NavigationManager _navigationManager_0 = (NavigationManagerImpl) contextManager.getInstance("Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final PerspectivePluginManager _pluginManager_1 = (RuntimePerspectivePluginManager) contextManager.getInstance("Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default");
    final NavTabListWidget _navWidget_2 = (NavTabListWidget) contextManager.getInstance("Type_factory__o_d_c_n_w_NavTabListWidget__quals__j_e_i_Any_j_e_i_Default");
    final NavTabListDragComponent instance = new NavTabListDragComponent(_navigationManager_0, _pluginManager_1, _navWidget_2);
    registerDependentScopedReference(instance, _navWidget_2);
    setIncompleteInstance(instance);
    thisInstance.setReference(instance, "onNavTreeChangedSubscription", CDI.subscribe("org.dashbuilder.navigation.event.NavTreeChangedEvent", new AbstractCDIEventCallback<NavTreeChangedEvent>() {
      public void fireEvent(final NavTreeChangedEvent event) {
        instance.onNavTreeChanged(event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.navigation.event.NavTreeChangedEvent []";
      }
    }));
    thisInstance.setReference(instance, "onNavTreeChangedSubscriptionForNavTreeChangedEvent", ErraiBus.get().subscribe("cdi.event:org.dashbuilder.navigation.event.NavTreeChangedEvent", CDI.ROUTING_CALLBACK));
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NavTabListDragComponent) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavTabListDragComponent instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onNavTreeChangedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onNavTreeChangedSubscriptionForNavTreeChangedEvent", Subscription.class)).remove();
  }
}