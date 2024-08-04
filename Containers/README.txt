Problem Statement:
You are given a set of objects with specified weights and a set of containers, each with a fixed capacity. The goal is to pack all the objects into the containers using two different algorithms and then display the packing results.

Algorithms Implemented:

Next Fit Algorithm:
This algorithm places each item into the current container if it fits. If the item doesn’t fit in the current container, a new container is started.
First Fit Algorithm:
This algorithm tries to place each item into the first container that has enough remaining capacity. If no such container exists, a new container is started.
Code Explanation:
Input Handling:

The user is prompted to enter the number of objects, the capacity of each container, and the weights of all the objects.
Conversion:

The weights are stored in an ArrayList and then converted into an array for processing by the packing algorithms.
Next Fit Method (next_Fit):

Initializes a list of containers.
Iterates through each object weight and tries to fit it into the current container. If it doesn’t fit, a new container is created.
First Fit Method (firstFit):

Similar to Next Fit but with a different approach. It attempts to place each object into the first container that has enough space. If no suitable container is found, a new one is created.