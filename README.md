# store-management-project
My project for Unit 2 AP CSA
# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

![UML Diagram for my project]
https://drive.google.com/file/d/1t40L9SdmnaNwgN3Io8UCXlPlo7EKqAzG/view?usp=drive_link

## Description

For my project, I created a makeup store  that showcases various makeup products, specifically focusing on blush and eyeshadow. I chose this topic because I like makeup, and I find it really enjoyable to do. 

The program features two main product types: Blush and Eyeshadow, both of which extend from the superclass MakeupProduct. This ranking illustrates the concept of inheritance, where both blush and eyeshadow inherit common attributes like name, price, and quantity from the MakeupProduct superclass. The MakeupProduct Class contains essential properties such as name, price, and quantity. It includes accessor (getter) and mutator (setter) methods to manage these properties, an example of encapsulation. The Blush subclass adds specific features like whether it is liquid or not and the shade. And for the Eyeshadow subclass, similar to the blush, includes properties like color and texture. The toString method overrides the superclass method to provide detailed information about the just the eyeshadow product.