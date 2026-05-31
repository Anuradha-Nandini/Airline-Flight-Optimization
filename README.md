
# Airline Flight Route Optimization and Passenger Scheduling System

## Project Overview

This project demonstrates the implementation of shortest-path algorithms and sorting algorithms in an airline transportation and scheduling environment. The system helps airlines optimize flight routes, reduce travel costs, improve connectivity between airports, and efficiently manage passenger records.

The project implements:

- Dijkstra's Algorithm
- Bellman-Ford Algorithm
- Floyd-Warshall Algorithm
- Merge Sort
- Quick Sort

These algorithms are commonly used in airline management systems, transportation networks, GPS navigation systems, and logistics planning.

---

## Objectives

- Implement and analyze Dijkstra's Algorithm for shortest path routing.
- Implement and analyze Bellman-Ford Algorithm for graphs with negative weights.
- Implement and analyze Floyd-Warshall Algorithm for all-pairs shortest path computation.
- Compare shortest path algorithms across different graph types.
- Implement Merge Sort and Quick Sort for passenger and schedule management.
- Evaluate sorting algorithm performance in data organization tasks.

---

## Problem Statement

An airline company operates multiple airports connected through flight routes. The company needs a system that can:

- Determine the shortest route between airports.
- Analyze connectivity across the entire airline network.
- Handle route cost adjustments and negative-weight scenarios.
- Sort passenger records and flight schedules efficiently.
- Optimize route planning and scheduling operations.

To solve these challenges, shortest path algorithms and sorting algorithms are implemented and evaluated.


## Algorithms Implemented

### 1. Dijkstra's Algorithm

#### Purpose
Computes the shortest path from a source airport to all other airports.

#### Suitable For
- Weighted graphs
- Directed graphs
- Undirected graphs
- Non-negative edge weights

#### Applications
- Flight route planning
- GPS navigation
- Transportation networks

#### Time Complexity

```text
O(V²)
```

---

### 2. Bellman-Ford Algorithm

#### Purpose
Computes shortest paths even when negative edge weights are present.

#### Suitable For
- Weighted directed graphs
- Graphs with negative weights

#### Applications
- Dynamic pricing systems
- Cost optimization networks
- Logistics planning

#### Time Complexity

```text
O(VE)
```

---

### 3. Floyd-Warshall Algorithm

#### Purpose
Finds shortest paths between every pair of airports.

#### Suitable For
- Weighted graphs
- Directed graphs
- Undirected graphs

#### Applications
- Global airline network analysis
- Airport connectivity management
- Transportation planning

#### Time Complexity

```text
O(V³)
```

---

### 4. Merge Sort

#### Purpose
Sorts passenger records and flight information using divide-and-conquer.

#### Advantages
- Stable sorting
- Consistent performance

#### Time Complexity

```text
Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n log n)
```

---

### 5. Quick Sort

#### Purpose
Efficiently sorts flight schedules and passenger records.

#### Advantages
- Fast average performance
- In-place sorting

#### Time Complexity

```text
Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n²)
```

---

## Sample Input

### Flight Route Graph

```text
0 --5-- 1
|      / |
2    1   3
|  /     |
2 --7-- 3
```

### Passenger IDs

```text
104, 102, 109, 101, 105
```

---

## Expected Output

```text
Dijkstra Results
0 : 0
1 : 3
2 : 2
3 : 6

Bellman-Ford Results
0 : 0
1 : 3
2 : 2
3 : 6

Floyd-Warshall Completed

Merge Sort Completed
Quick Sort Completed

Flight Optimization Completed
```

---

## Performance Analysis

| Algorithm | Time Complexity |
|------------|----------------|
| Dijkstra | O(V²) |
| Bellman-Ford | O(VE) |
| Floyd-Warshall | O(V³) |
| Merge Sort | O(n log n) |
| Quick Sort (Average) | O(n log n) |
| Quick Sort (Worst) | O(n²) |

Where:

- V = Number of Airports (Vertices)
- E = Number of Flight Routes (Edges)
- n = Number of Passenger Records

---

## Algorithm Comparison

| Feature | Dijkstra | Bellman-Ford | Floyd-Warshall |
|----------|-----------|--------------|---------------|
| Weighted Graph | Yes | Yes | Yes |
| Directed Graph | Yes | Yes | Yes |
| Undirected Graph | Yes | Yes | Yes |
| Negative Weights | No | Yes | Yes |
| Negative Cycle Detection | No | Yes | No |
| Single Source Shortest Path | Yes | Yes | No |
| All-Pairs Shortest Path | No | No | Yes |

---

## Applications

### Airline Industry
- Flight Route Optimization
- Airport Network Analysis
- Passenger Scheduling

### Logistics Systems
- Route Planning
- Transportation Cost Reduction

### Navigation Systems
- GPS Routing
- Smart Transportation

### Data Processing
- Passenger Record Management
- Flight Schedule Organization

---

## Results

The implemented system successfully:

- Computed shortest flight routes using Dijkstra's Algorithm.
- Handled weighted graphs using Bellman-Ford Algorithm.
- Generated all-pairs shortest paths using Floyd-Warshall Algorithm.
- Organized passenger records using Merge Sort.
- Managed flight schedules using Quick Sort.

The results demonstrated the effectiveness of graph algorithms and sorting techniques in airline and transportation systems.

---

## Conclusion

This project successfully demonstrates the implementation and comparison of Dijkstra's, Bellman-Ford, and Floyd-Warshall algorithms for route optimization in airline networks. Merge Sort and Quick Sort efficiently handled passenger and scheduling data. The study highlights how different shortest-path algorithms are suitable for different graph types and operational requirements, making them essential tools in modern transportation and logistics systems.

