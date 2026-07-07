# Checkout Test Suite

**Description:** test suite verifies, that pages, involved into checkout process or display its results, function as intended. These pages include product, cart, checkout confirm and order history pages.

## Common Preconditions

If not specified contrary to these items, such preconditions are common for each test case in this suite:
1. You have preregistered account;
2. You are logged in preregistered account from common precondition \#1;
3. Cart is empty before test case execution. If it is not, delete all products from it manually.

## Test Cases

[Traceability Matrix](./checkout-traceability-matrix.md)

### General test cases

#### Positive

| ID        | Title                                                                                     | Level | Priority  |
|-----------|-------------------------------------------------------------------------------------------|-------|-----------|
| TC-CHK-01 | [Checkout with one product](./TC-CHK-01_checkout-with-one-product.md)                     | Smoke | Very high |
| TC-CHK-02 | [Checkout with more than one product](./TC-CHK-02_checkout-with-more-than-one-product.md) | Smoke | Very high |

#### Negative

| ID        | Title                                                                             | Level         | Priority |
|-----------|-----------------------------------------------------------------------------------|---------------|----------|
| TC-CHK-20 | [Adding product being logged out](./TC-CHK-20_adding-product-being-logged-out.md) | Critical path | Medium   |

### Product page test cases

#### Positive

#### Negative

| ID        | Title                                                                                                                                     | Level         | Priority |
|-----------|-------------------------------------------------------------------------------------------------------------------------------------------|---------------|----------|
| TC-CHK-04 | [Adding zero products](./product-page/TC-CHK-04_adding-zero-products.md)                                                                  | Critical path | High     |
| TC-CHK-05 | [Adding more than in stock products](./product-page/TC-CHK-05_adding-more-than-in-stock-products.md)                                      | Critical path | Low      |
| TC-CHK-06 | [Adding out of stock product](./product-page/TC-CHK-06_adding-out-of-stock-product.md)                                                    | Critical path | Medium   |
| TC-CHK-07 | [Adding coma separated decimal quantity of products](./product-page/TC-CHK-07_adding-coma-separated-decimal-quantity-of-product.md)       | Extended      | Medium   |
| TC-CHK-08 | [Adding dot separated decimal quantity of products](./product-page/TC-CHK-08_adding-dot-separated-decimal-quantity-of-product.md)         | Extended      | Medium   |
| TC-CHK-09 | [Adding starting with zero product quantity](./product-page/TC-CHK-09_adding-starting-with-zero-product-quantity.md)                      | Critical path | Medium   |
| TC-CHK-10 | [Adding negative number of products](./product-page/TC-CHK-10_adding-negative-number-of-products.md)                                      | Critical path | Medium   |
| TC-CHK-11 | [Adding products with forbidden characters in quantity](./product-page/TC-CHK-11_adding-product-with-forbidden-characters-in-quantity.md) | Critical path | High     |
| TC-CHK-19 | [Adding more than max per order quantity](./product-page/TC-CHK-19_adding-more-than-max-per-order-quantity.md)                            | Critical path | High     |

### Cart page test cases

#### Positive

| ID        | Title                                                                                                                | Level         | Priority |
|-----------|----------------------------------------------------------------------------------------------------------------------|---------------|----------|
| TC-CHK-03 | [Cart "Country" brings "Region / State" to default](./cart/TC-CHK-03-cart-country-brings-region_state-to-default.md) | Critical path | High     |

#### Negative

| ID        | Title                                                                                                                                      | Level         | Priority |
|-----------|--------------------------------------------------------------------------------------------------------------------------------------------|---------------|----------|
| TC-CHK-12 | [Cart item quantity, setting to zero](./cart/TC-CHK-12_cart-item-quantity-setting-to-zero.md)                                              | Critical path | High     |
| TC-CHK-13 | [Cart item quantity, coma separated decimal](./cart/TC-CHK-13_cart-item-quantity-coma-separated-decimal.md)                                | Extended      | Medium   |
| TC-CHK-14 | [Cart item quantity, dot separated decimal](./cart/TC-CHK-14_cart-item-quantity-dot-separated-decimal.md)                                  | Extended      | Medium   |
| TC-CHK-15 | [Cart item quantity, starting with zero integer](./cart/TC-CHK-15_cart-item-quantity-starting-with-zero-integer.md)                        | Critical path | High     |
| TC-CHK-16 | [Cart item quantity, forbidden characters](./cart/TC-CHK-16_cart-item-quantity-forbidden-characters.md)                                    | Critical path | High     |
| TC-CHK-17 | [Cart item quantity, more than allowed per purchase](./cart/TC-CHK-17_cart-item-quantity-more-than-allowed-per-order.md)                   | Critical path | High     |
| TC-CHK-18 | [Exceeding per order limit by adding product to cart twice](./cart/TC-CHK-18_exceeding-per-order-limit-by-adding-product-to-cart-twice.md) | Extended      | Medium   |
