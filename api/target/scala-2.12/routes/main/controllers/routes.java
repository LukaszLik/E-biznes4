// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wiki/Pulpit/e-biznes/shop-scala/E-biznes/e-biz-zad-3/conf/routes
// @DATE:Tue May 11 19:52:13 CEST 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseDiscountController DiscountController = new controllers.ReverseDiscountController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePaymentController PaymentController = new controllers.ReversePaymentController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCartController CartController = new controllers.ReverseCartController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCategoryController CategoryController = new controllers.ReverseCategoryController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProductController ProductController = new controllers.ReverseProductController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRecordInCartController RecordInCartController = new controllers.ReverseRecordInCartController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseOrderController OrderController = new controllers.ReverseOrderController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProductReviewController ProductReviewController = new controllers.ReverseProductReviewController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAddressController AddressController = new controllers.ReverseAddressController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseDiscountController DiscountController = new controllers.javascript.ReverseDiscountController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePaymentController PaymentController = new controllers.javascript.ReversePaymentController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCartController CartController = new controllers.javascript.ReverseCartController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCategoryController CategoryController = new controllers.javascript.ReverseCategoryController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProductController ProductController = new controllers.javascript.ReverseProductController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRecordInCartController RecordInCartController = new controllers.javascript.ReverseRecordInCartController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseOrderController OrderController = new controllers.javascript.ReverseOrderController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProductReviewController ProductReviewController = new controllers.javascript.ReverseProductReviewController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAddressController AddressController = new controllers.javascript.ReverseAddressController(RoutesPrefix.byNamePrefix());
  }

}
