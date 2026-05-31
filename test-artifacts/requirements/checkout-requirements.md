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
- BR-CHK-02-01: Attempting to add to cart product with zero quantity on the product page must trigger a "zero quantity" prompt.
- BR-CHK-02-02: Setting product quantity to zero on a cart page must simply clear the item from the cart upon checkout attempt.

BR-CHK-03: Users are strictly prevented from purchasing more units of a product than are currently available in stock.

BR-CHK-04: Out-of-stock products cannot be added to the cart under any circumstances.

## Limitations

LM-CHK-01: The geographical inputs (Country and Region/State) for shipping estimation are interdependent and restricted to predefined datasets.

LM-CHK-02: Altering the country clears the state selection.

## Detailed Specifications

### Cart Management & Validation

| Req ID       | Description                                                                                                                                                                                                                                                                   | Priority |
|--------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------|
| DS-CHK-01.01 | If a user attempts to add a quantity of "0" for a product from the product page, the system shall block the action, keep the user on the product page, and display a "zero quantity" prompt.                                                                                  | High     |
| DS-CHK-01.02 | If a user sets a product's quantity to "0" within the cart and clicks "Checkout", the system shall empty the cart and keep the user on the cart page (/index.php?rt=checkout/cart).                                                                                           | High     |
| DS-CHK-01.03 | If a user selects a product that is entirely out of stock, the "Add to cart" button must be disabled and clicking it shall have no effect.                                                                                                                                    | High     |
| DS-CHK-01.04 | If a user attempts to add a quantity greater than the available stock, the system shall redirect them to the cart page, mark the offending product with "***", and display the prompt: "Products marked with *** are not available in the desired quantity or out of stock!". | High     |
| DS-CHK-01.05 | If a user modifies the quantity of an item already in the cart to a number exceeding available stock and attempts to checkout, the system shall block the checkout, remain on the cart page, mark the product with "***", and display the stock error prompt.                 | High     |
| DS-CHK-01.06 | On the cart page, changing the selected "Country" in the shipping estimator shall instantly reset the "State" dropdown to the default "--- Please Select ---" value.                                                                                                          | Medium   |

### Checkout Process

| Req ID       | Description                                                                                                                                                                                                      | Priority |
|--------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------|
| DS-CHK-02.01 | Upon navigating to the cart page, the "Estimate Shipping & Taxes" fields must be automatically pre-filled using the authenticated user's account profile data.                                                   | High     |
| DS-CHK-02.02 | If a user attempts to proceed to checkout with the "State" dropdown set to "--- Please Select ---", the system shall block the action, remain on the cart page, and display a "select state" prompt.             | High     |
| DS-CHK-02.03 | Upon clicking "Confirm order" on the checkout confirmation page (/index.php?rt=checkout/confirm), the system shall process the order and redirect the user to the success page (/index.php?rt=checkout/success). | Critical |

### Order History & Invoicing

| Req ID       | Description                                                                                                                                                                                                                                           | Priority |
|--------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------|
| DS-CHK-03.01 | The system shall provide an "Order history" page (/index.php?rt=account/history) accessible via the account navigation menu, which accurately reflects the total number of distinct product positions (not unit quantities) in the most recent order. | High     |
| DS-CHK-03.02 | Viewing a specific order invoice (/index.php?rt=account/invoice&order_id=${order_id}) must display shipping and payment information exactly matching the "Estimate Shipping & Taxes" fields provided during checkout.                                 | High     |
| DS-CHK-03.03 | The invoice must display an email address, first name, last name, address, and city identical to the customer's account details at the time of purchase.                                                                                              | High     |
| DS-CHK-03.04 | The total cost calculated on the invoice must strictly equal the sum of all ordered products multiplied by their respective quantities, plus the calculated shipping cost.                                                                            | Critical |
