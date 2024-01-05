<template>
    <div>
      <h2>登录</h2>
      <form @submit.prevent="login">
        <div>
          <label for="username">用户名:</label>
          <input type="text" id="username" v-model="username" required />
        </div>
        <div>
          <label for="password">密码:</label>
          <input type="password" id="password" v-model="password" required />
        </div>
        <div>
          <button type="submit">登录</button>
        </div>
        <div>
          <button @click="goToRegister">注册</button>
        </div>
      </form>
    </div>
  </template>
  
<script lang="ts">
import axios from 'axios';
  export default {
    data() {
      return {
        username: '',
        password: '',
      };
    },
    methods: {
      async login() {
      try {
        // 发送登录请求到后端
        const response = await axios.post('/api/login', {
          username: this.username,
          password: this.password
        });

        // 假设后端返回的数据中有一个 success 字段表示登录是否成功
        if (response.data.success) {
          // 登录成功，执行页面跳转到 'Admin.vue' 组件
          this.$router.push('/admin');
        } else {
          // 登录失败，处理失败情况
          console.log('登录失败:', response.data.message);
        }
      } catch (error) {
        // 处理请求错误
      if (typeof error === 'string') {
      console.log('请求错误:', error);
       } else {
      console.log('请求错误:', (error as Error).message);
      }
      }
    },

      goToRegister() {
      // 在这里进行页面跳转到注册页面的操作
      this.$router.push('/register');
    }
    },
  };
  </script>
  
  <style scoped>
  h2 {
    text-align: center;
  }
  form {
    max-width: 300px;
    margin: 0 auto;
  }
  label {
    display: block;
    margin-bottom: 5px;
  }
  input[type='text'],
  input[type='password'] {
    width: 100%;
    padding: 5px;
    margin-bottom: 10px;
  }
  button {
    padding: 10px 20px;
  }
  </style>