<template>
  <div class="home-page page1">
    <div class="home-page-wrapper" id="page1-wrapper">
<!--      <div class="page1-bg" style="transform: translate(0px, 200.953px);">Feature</div>-->
      <h2>What can <span>Online System</span> do for you </h2>
<!--      <div class="title-line-wrapper page1-line"></div>-->
      <list :data-source="features" />
    </div>
  </div>
</template>

<script>
import List from './List'
const featuresCN = [
  {
    title: '批量出题',
    content: '支持单选、多选、填空、判断、问答等题型',
    src: 'https://gw.alipayobjects.com/zos/rmsportal/VriUmzNjDnjoFoFFZvuh.svg',
    color: '#13C2C2',
    shadowColor: 'rgba(19,194,194,.12)'
  },
  {
    title: '灵活组卷',
    content: '教师手动选题组卷适应各种考试业务需求',
    src: 'https://gw.alipayobjects.com/zos/rmsportal/smwQOoxCjXVbNAKMqvWk.svg',
    color: '#2F54EB',
    shadowColor: 'rgba(47,84,235,.12)'
  },
  {
    title: '快速答题',
    content: '只需创建考试，题库选择试题组卷，发布考试',
    src: 'https://gw.alipayobjects.com/zos/rmsportal/hBbIHzUsSbSxrhoRFYzi.svg',
    color: '#F5222D',
    shadowColor: 'rgba(245,34,45,.12)'
  },
  {
    title: '多项配置',
    content: '设置试卷难度、答题时间、成绩显示',
    src: 'https://gw.alipayobjects.com/zos/rmsportal/BISfzKcCNCYFmTYcUygW.svg',
    color: '#1AC44D',
    shadowColor: 'rgba(26,196,77,.12)'
  },
  {
    title: '智能阅卷',
    content: '自动阅卷评分',
    src: 'https://gw.alipayobjects.com/zos/rmsportal/pbmKMSFpLurLALLNliUQ.svg',
    color: '#FA8C16',
    shadowColor: 'rgba(250,140,22,.12)'
  },
  {
    title: '成绩分析',
    content: '答题统计、成绩统计',
    src: 'https://gw.alipayobjects.com/zos/rmsportal/RpJIQitGbSCHwLMimybX.svg',
    color: '#1890FF',
    shadowColor: 'rgba(24,144,255,.12)'
  }
]

export default {
  name: 'Page1',
  components: {
    List
  },
  data () {
    return {
      features: featuresCN
    }
  },
  created () {
    this.updateFeatures()
  },
  methods: {
    updateFeatures () {
      const arr = featuresCN
      const newArr = [[], [], []]
      arr.forEach((item, index) => {
        newArr[Math.floor(index / 3)].push(item)
      })
      this.features = newArr
    }
  }
}
</script>
