# Checkout Requirements
[back to main requirements catalog](requirements.md)

## System Characteristics

SC-CHK-01: The system shall provide an integrated shopping cart and checkout process that interacts directly with the user's account profile to pre-fill shipping and tax estimation data.

SC-CHK-02: The system shall persistently track order history and generate detailed invoices for all completed purchases.

SC-CHK-03: The system shall dynamically validate inventory levels in real-time when products are added to the cart and during the final checkout confirmation.

## User Requirements

UR-CHK-01: A logged-in user shall be able to browse products, add single or multiple distinct items to their cart, and proceed to checkout.

UR-CHK-02: A user shall be able to view their complete order history from their account dashboard.

UR-CHK-03: A user shall receive immediate, transparent feedback if they attempt to purchase an unavailable quantity of a product.

## Business Rules

BR-CHK-01: Only authenticated (logged-in) users are permitted to add products to the shopping cart.
- BR-CHK-01-01: Guest users must be redirected to the login page (/index.php?rt=account/login) upon attempting to add an item.

BR-CHK-02: A user cannot checkout with a product quantity of zero.
- BR-CHK-02.01: Attempting to add to cart product with zero quantity on the product page must trigger a "zero quantity" prompt.
- BR-CHK-02.02: Setting product quantity to zero on a cart page must simply clear the item from the cart upon checkout attempt.

BR-CHK-03: Users are strictly prevented from purchasing more units of a product than are currently available in stock.

BR-CHK-04: Out-of-stock products cannot be added to the cart under any circumstances.

## Limitations

LM-CHK-01: The geographical inputs (Country and Region/State) for shipping estimation are interdependent and restricted to predefined datasets.

LM-CHK-02: Altering the country clears the state selection.

## Detailed Specifications

### DS-CHK-01: Cart Management & Validation

DS-CHK-01.01: The quantity field on product page and cart page must strictly accept only non-negative integers (whole numbers greater than or equal to zero).
- DS-CHK-01.01.01: The system shall automatically reject any inputs containing decimal points, fractions, alphabetical characters, special symbols, or negative signs (-).

DS-CHK-01.02: If a user attempts to add a quantity of "0" for a product from the product page, the system shall block the action, keep the user on the product page, and display a "zero quantity" prompt.

DS-CHK-01.03: If a user sets a product's quantity to "0" within the cart and clicks "Checkout", the system shall empty the cart and keep the user on the cart page (/index.php?rt=checkout/cart).

DS-CHK-01.04: If a user selects a product that is entirely out of stock, the "Add to cart" button must be disabled and clicking it shall have no effect.

DS-CHK-01.05: If a user attempts to add a quantity greater than the available stock, the system shall redirect them to the cart page, mark the offending product with "***", and display the prompt: "Products marked with *** are not available in the desired quantity or out of stock!".

DS-CHK-01.06: If a user modifies the quantity of an item already in the cart to a number exceeding available stock and attempts to checkout, the system shall block the checkout, remain on the cart page, mark the product with "***", and display the stock error prompt.

DS-CHK-01.07: On the cart page, changing the selected "Country" in the shipping estimator shall instantly reset the "State" dropdown to the default "--- Please Select ---" value.

DS-CHK-01.08: If a user attempts to add a product quantity that exceeds the defined maximum per-order limit, the system shall automatically adjust the added quantity to the maximum allowed limit. Upon successful addition to the cart, the system must display a prominent warning notification: "Allowed product's quantity exceeds. Quantity was set to maximum."

DS-CHK-01.09: If a user modifies the product quantity directly on the cart page to a value exceeding the per-order limit and updates the cart, the system shall automatically reduce the value in the quantity field to the maximum allowed limit and display a warning notification, specified in [DS-CHK-01.08](#ds-chk-01-cart-management--validation) requirement.

DS-CHK-01.10: If a user adds a valid quantity from the product page, but the cart already contains this product and the new cumulative total would exceed the per-order limit, the system shall cap the cart quantity at the maximum allowed limit and display a warning notification, specified in [DS-CHK-01.08](#ds-chk-01-cart-management--validation) requirement.

### DS-CHK-02: Checkout Process

DS-CHK-02.01: Upon navigating to the cart page, the "Estimate Shipping & Taxes" fields must be automatically pre-filled using the authenticated user's account profile data.

DS-CHK-02.02: If a user attempts to proceed to checkout with the "State" dropdown set to "--- Please Select ---", the system shall block the action, remain on the cart page, and display a "select state" prompt.

DS-CHK-02.03: Upon clicking "Confirm order" on the checkout confirmation page (/index.php?rt=checkout/confirm), the system shall process the order and redirect the user to the success page (/index.php?rt=checkout/success).

### DS-CHK-03: Order History & Invoicing

DS-CHK-03.01: The system shall provide an "Order history" page (/index.php?rt=account/history) accessible via the account navigation menu, which accurately reflects the total number of distinct product positions (not unit quantities) in the most recent order.

DS-CHK-03.02: Viewing a specific order invoice (/index.php?rt=account/invoice&order_id=${order_id}) must display shipping and payment information exactly matching the "Estimate Shipping & Taxes" fields provided during checkout.

DS-CHK-03.03: The invoice must display an email address, first name, last name, address, and city identical to the customer's account details at the time of purchase.

DS-CHK-03.04: The total cost calculated on the invoice must strictly equal the sum of all ordered products multiplied by their respective quantities, plus the calculated shipping cost.
