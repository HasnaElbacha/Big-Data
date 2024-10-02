version: "2"
services:
    namenode:
      image: apache/hadoop:3.3.5
      hostname: namenode
      command: ["hdfs", "namenode"]
      ports:
        - 9870:9870
      env_file:
        - ./config
      environment:
          ENSURE_NAMENODE_DIR: "/tmp/hadoop-root/dfs/name"
      networks:
          -hadoop_network
    datanode1:
      image: apache/hadoop:3.3.5
      hostname: datanode1
      command: ["hdfs", "datanode"]
      env_file:
        - ./config   
      networks:
          -hadoop_network  
    datanode2:
      image: apache/hadoop:3.3.5
      hostname: datanode2
      command: ["hdfs", "datanode"]
      env_file:
        - ./config   
      networks:
          -hadoop_network   
    datanode3:
      image: apache/hadoop:3.3.5
      hostname: datanode3
      command: ["hdfs", "datanode"]
      env_file:
        - ./config   
      networks:
          -hadoop_network  
    datanode4:
      image: apache/hadoop:3.3.5
      hostname: datanode4
      command: ["hdfs", "datanode"]
      env_file:
        - ./config   
      networks:
          -hadoop_network
    datanode5:
      image: apache/hadoop:3.3.5
      hostname: datanode5
      command: ["hdfs", "datanode"]
      env_file:
        - ./config   
      networks:
          -hadoop_network             
    resourcemanager:
      image: apache/hadoop:3.3.5
      hostname: resourcemanager
      command: ["yarn", "resourcemanager"]
      ports:
         - 8088:8088
      env_file:
        - ./config
      volumes:
        - ./test.sh:/opt/test.sh
      networks:
          -hadoop_network
    nodemanager:
      image: apache/hadoop:3.3.5
      command: ["yarn", "nodemanager"]
      env_file:
        - ./config
        
    networks:
     hadoop_network:
        driver: bridge