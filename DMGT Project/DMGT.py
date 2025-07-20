from collections import defaultdict
import heapq


class FinalAlgorithm:
    class Edge:
        def __init__(self, src, des, weight):
            self.src = src
            self.des = des
            self.weight = weight

    @staticmethod
    def create_graph(graph):
        graph[0].append(FinalAlgorithm.Edge(0, 1, 1))
        graph[0].append(FinalAlgorithm.Edge(0, 2, 5))
        graph[0].append(FinalAlgorithm.Edge(0, 3, 24))

        graph[1].append(FinalAlgorithm.Edge(1, 0, 5))
        graph[1].append(FinalAlgorithm.Edge(1, 2, 8))

        graph[2].append(FinalAlgorithm.Edge(2, 1, 8))
        graph[2].append(FinalAlgorithm.Edge(2, 3, 12))
        graph[2].append(FinalAlgorithm.Edge(2, 5, 7))

        graph[3].append(FinalAlgorithm.Edge(3, 2, 12))
        graph[3].append(FinalAlgorithm.Edge(3, 4, 11))

        graph[4].append(FinalAlgorithm.Edge(4, 5, 9))
        graph[4].append(FinalAlgorithm.Edge(4, 3, 11))

        graph[5].append(FinalAlgorithm.Edge(5, 4, 9))
        graph[5].append(FinalAlgorithm.Edge(5, 2, 7))
        graph[5].append(FinalAlgorithm.Edge(5, 0, 6))

    @staticmethod
    def print_all_path(graph, vis, curr, path, tar, Map, length):
        if curr == tar:
            Map[length] = path + " " + str(tar)
            return

        vis[curr] = True

        for e in graph[curr]:
            if not vis[e.des]:
                length = length + e.weight
                FinalAlgorithm.print_all_path(
                    graph, vis, e.des, path + " " + str(curr), tar, Map, length)
                length = length - e.weight

        vis[curr] = False

    @staticmethod
    def main():
        V = 7
        graph = [[] for _ in range(V)]
        Map = {}
        FinalAlgorithm.create_graph(graph)
        src = 0
        tar = 5
        visit = [False] * V
        FinalAlgorithm.print_all_path(graph, visit, src, "", tar, Map, 0.0)

        entry_list = list(Map.items())
        entry_list.sort(key=lambda x: x[0])

        i = 0
        print("All Possible Path:- ")
        for entry in entry_list:
            i += 1
            print(
                f"{i}) Path: {entry[1]}\n   Length: {entry[0]}\n____________________")


if __name__ == "__main__":
    FinalAlgorithm.main()
