package org.jboss.errai.ioc.client;

import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.AbstractGwtDisplayer.View;
import org.dashbuilder.displayer.client.AbstractGwtDisplayerView;
import org.dashbuilder.renderer.c3.client.C3AbstractDisplayerView;
import org.dashbuilder.renderer.c3.client.C3DisplayerView;
import org.dashbuilder.renderer.c3.client.charts.pie.C3PieChartView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberView;

public class Type_factory__o_d_r_c_c_c_p_C3PieChartView__quals__j_e_i_Any_j_e_i_Default extends Factory<C3PieChartView> { public Type_factory__o_d_r_c_c_c_p_C3PieChartView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(C3PieChartView.class, "Type_factory__o_d_r_c_c_c_p_C3PieChartView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { C3PieChartView.class, C3DisplayerView.class, C3AbstractDisplayerView.class, AbstractGwtDisplayerView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, View.class, org.dashbuilder.displayer.client.AbstractDisplayer.View.class, UberView.class, HasPresenter.class, org.dashbuilder.renderer.c3.client.C3AbstractDisplayer.View.class, org.dashbuilder.renderer.c3.client.C3Displayer.View.class, org.dashbuilder.renderer.c3.client.charts.pie.C3PieChartDisplayer.View.class });
  }

  public C3PieChartView createInstance(final ContextManager contextManager) {
    final C3PieChartView instance = new C3PieChartView();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}